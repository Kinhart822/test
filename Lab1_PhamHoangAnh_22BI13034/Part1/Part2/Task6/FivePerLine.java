package Lab1_PhamHoangAnh_22BI13034.Part1.Part2.Task6;

public class FivePerLine {
    public static void main(String[] args) {
        for (int i = 1000; i <= 2000; i++) {
            System.out.print(i);
            if (i % 5 == 0) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }
}
