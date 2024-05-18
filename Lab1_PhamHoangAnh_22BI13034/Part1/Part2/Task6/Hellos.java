package Lab1_PhamHoangAnh_22BI13034.Part1.Part2.Task6;

public class Hellos {
    public static void main(String[] args) {
        int n = 100;
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i % 10 == 1 && i % 100 != 11) {
                System.out.print("st");
            } else if (i % 10 == 2 && i % 100 != 12) {
                System.out.print("nd");
            } else if (i % 10 == 3 && i % 100 != 13) {
                System.out.print("rd");
            } else {
                System.out.print("th");
            }
            System.out.println(" Hello");
        }
    }
}
