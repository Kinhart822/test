package com.spring.controller;

import com.spring.dao.MemberDAO;
import com.spring.model.Member;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MemberController {

    @Autowired
    private MemberDAO memberDAO;

    @GetMapping("/admin/members")
    public String listMember(Model model,
                             @RequestParam(value = "page", defaultValue = "1") Integer pageNumber,
                             @RequestParam(value = "keyword", required = false) String keyword,
                             HttpSession session) {
        int pageSizeDefault = 5;

        // Lấy thành viên đã đăng nhập từ session
        Member loggedInMember = (Member) session.getAttribute("loggedInMember");

        // Tính toán tổng số mục dựa trên keyword
        long totalItems;
        int totalPages;

        if (keyword == null || keyword.isBlank()) {
            totalItems = memberDAO.readAll().size();
        } else {
            totalItems = memberDAO.findByUserName(keyword).size();
        }

        totalPages = (int) Math.ceil((double) totalItems / pageSizeDefault);

        List<Integer> pageNums = new ArrayList<>();
        for (int i = 1; i <= totalPages; i++) {
            pageNums.add(i);
        }

        // Lấy danh sách thành viên dựa trên keyword
        List<Member> members;
        if (keyword == null || keyword.isBlank()) {
            members = memberDAO.readAll(pageNumber, pageSizeDefault);
        } else {
            members = memberDAO.findByUserName(keyword);
        }

        model.addAttribute("memberList", members);
        model.addAttribute("pageNums", pageNums);
        model.addAttribute("currentPage", pageNumber);
        model.addAttribute("totalPages", totalPages);
        model.addAttribute("loggedInMember", loggedInMember);  // Thêm loggedInMember vào model
        return "admin/members/UserProfile";
    }

    @GetMapping("/register")
    public String showUiRegister(Model model) {
        model.addAttribute("member", new Member());
        return "register";
    }

    @PostMapping("/register")
    public String saveMember(Member member, RedirectAttributes redirectAttributes) {
        Member existingMember = memberDAO.findByEmailAndPassword(member.getEmail(), member.getPassword());

        if (existingMember != null) {
            redirectAttributes.addFlashAttribute("messageError", "Member already exists. Please login.");
            return "redirect:/register";
        }

        memberDAO.create(member);
        redirectAttributes.addFlashAttribute("message", "New member created successfully");
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String showUiLogin(Model model){
        model.addAttribute("member", new Member());
        return "login";
    }

    @GetMapping("/EditProfile")
    public String showUiEditProfile(Model model){
        model.addAttribute("member", new Member());
        return "EditProfile";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("member") Member member, HttpSession session, RedirectAttributes redirectAttributes) {
        Member existingMember = memberDAO.findByEmailAndPassword(member.getEmail(), member.getPassword());
        if (existingMember != null) {
            session.setAttribute("loggedInMember", existingMember);  // Lưu thành viên đã đăng nhập vào session
            return "redirect:/EditProfile";
        } else {
            redirectAttributes.addFlashAttribute("messageError", "Member not found. Please register.");
            return "redirect:/register";
        }
    }

    @PostMapping("/EditProfile")
    public String EditProfile(@ModelAttribute("member") Member member,
                              @RequestParam("action") String action,
                              HttpSession session,
                              RedirectAttributes redirectAttributes) {
        if ("update".equals(action)) {
            Member existingMember = memberDAO.findByEmail(member.getEmail());
            if (existingMember != null) {
                memberDAO.updateProfile(member);
                session.setAttribute("loggedInMember", existingMember);  // Cập nhật thành viên vào session
                redirectAttributes.addFlashAttribute("message", "Profile updated successfully");
            } else {
                redirectAttributes.addFlashAttribute("messageError", "Member not found.");
            }
        } else if ("delete".equals(action)) {
            Member existingMember = memberDAO.findByEmail(member.getEmail());
            if (existingMember != null) {
                memberDAO.delete(existingMember);
                redirectAttributes.addFlashAttribute("message", "Profile deleted successfully");
                session.removeAttribute("loggedInMember");  // Xóa thông tin thành viên khỏi session sau khi xóa
                return "redirect:/register";  // Chuyển hướng đến trang đăng ký sau khi xóa
            } else {
                redirectAttributes.addFlashAttribute("messageError", "Member not found.");
            }
        }
        return "redirect:/FormContent";
    }

    @GetMapping(value ={"/home", "/"})
    public String home(Model model) {
        String msg = "Hello Spring";
        model.addAttribute("message", msg);
        return "home";
    }

    @GetMapping("/admin/members/delete/{id}")
    public RedirectView deleteMember(@PathVariable("id") Integer idMembers, RedirectAttributes attributes){
        RedirectView redirectView = new RedirectView();

        Member member = memberDAO.readOne(idMembers);

        if(member != null){
            memberDAO.delete(member);
        }

        attributes.addFlashAttribute("message", "Delete member successfully");

        redirectView.setUrl("/admin/members");
        return redirectView;
    }

    @GetMapping("admin/members/edit")
    public String editMember(@RequestParam("id") Integer idMember, Model model){
        Member memberDB = memberDAO.readOne(idMember);
        model.addAttribute("member", memberDB);

        return "admin/members/edit";
    }

    @PostMapping("/admin/members/update")
    public String updateMember(@ModelAttribute("member") Member member,
                               @RequestParam("repassword") String repassword,
                               RedirectAttributes redirectAttributes) {
        // Get the existing member from the database
        Member existingMember = memberDAO.readOne(member.getId());

        // Check if passwords match
        if (!member.getPassword().equals(repassword)) {
            redirectAttributes.addFlashAttribute("messageError", "Passwords do not match.");
            return "redirect:/admin/members/edit?id=" + member.getId();
        }
        // Update the updateTime
        member.setUpdateTime(LocalDateTime.now());

        // Update the member information in the database
        memberDAO.update(member);

        redirectAttributes.addFlashAttribute("message", "Update member successfully");
        return "redirect:/admin/members";
    }
}
