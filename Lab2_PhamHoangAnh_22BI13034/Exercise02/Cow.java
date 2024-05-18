package Lab2_PhamHoangAnh_22BI13034.Exercise02;

public class Cow {
    private String name;
    private String breed;
    private int age;

    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public int getAge() {
        return age;
    }
    public void setName(String newName) {
        name = newName;
    }
    public void setBreed(String newBreed) {
        breed = newBreed;
    }
    public void setAge(int newAge) {
        age = newAge;
    }
    public void moo() {
        System.out.println("Moo...");
    }
}
