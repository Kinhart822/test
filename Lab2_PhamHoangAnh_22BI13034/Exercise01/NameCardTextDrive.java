package Lab2_PhamHoangAnh_22BI13034.Exercise01;

public class NameCardTextDrive {
    public static void main(String[] args) {
      NameCard p = new NameCard();
      p.setName("Phạm Hoàng Anh");
      p.setEmail("pha@Email.com");
      p.setPhone("0123456789");
      System.out.println("Name: " + p.getName());
      System.out.println("Email: " + p.getEmail());
      System.out.println("Phone: " + p.getPhone());
    }
}
