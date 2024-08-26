package com.spring.dao;

import com.spring.model.Member;

import java.util.List;

public interface MemberDAO {
    Member create(Member member);

    Member update(Member member);

    Member updateProfile(Member member);

    Member delete(Member member);

    Member readOne(Integer id);

    List<Member> readAll();

    Member findByEmailAndPassword(String email, String password);

    Member findByEmail(String email);

    List<Member> readAll(int page, int pageSize);

    List<Member> findByUserName(String name);
}
