package Lab1_PhamHoangAnh_22BI13034.Part1.Part2.Task5;

public class DivisorPattern {
    public static void main(String[] args) {
        int n =56;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i % j == 0) || (j % i == 0)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(i);
        }
    }
}

