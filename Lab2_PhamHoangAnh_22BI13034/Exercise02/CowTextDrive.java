package Lab2_PhamHoangAnh_22BI13034.Exercise02;

public class CowTextDrive {
    public static void main(String[] args) {
      Cow cow = new Cow();
      cow.setName("Cow 1");
      cow.setBreed("Holstein");
      cow.setAge(4);
      System.out.println("Name: " + cow.getName());
      System.out.println("Breed: " + cow.getBreed());
      System.out.println("Age: " + cow.getAge());
      cow.moo();
    }
}
