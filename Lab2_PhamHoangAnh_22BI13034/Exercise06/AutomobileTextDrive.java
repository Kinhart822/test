package Lab2_PhamHoangAnh_22BI13034.Exercise06;

public class AutomobileTextDrive {
    public static void main(String[] args) {
        Automobile a = new Automobile();
        a.init(4.5, 34, "29JAD");
        a.accelerate(4);
        System.out.println(a.getSpeed());
        a.decelerate(3);
        System.out.println(a.getSpeed());
    }
}
