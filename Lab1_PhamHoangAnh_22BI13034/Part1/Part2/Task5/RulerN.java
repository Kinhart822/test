package Lab1_PhamHoangAnh_22BI13034.Part1.Part2.Task5;

public class RulerN {
    public static void main(String[] args) {
        int n = 20;

        // ruler of order 0
        String ruler = " ";

        // repeat n times
        for (int i = 1; i <= n; i++) {

            // concatenate a ruler of order 0, the number i, and a ruler of order 0
            ruler = ruler + i + ruler;

            // print out the final result
            System.out.println(ruler);
        }

    }
}