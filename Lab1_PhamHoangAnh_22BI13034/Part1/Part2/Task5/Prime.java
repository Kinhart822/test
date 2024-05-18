package Lab1_PhamHoangAnh_22BI13034.Part1.Part2.Task5;

import java.util.ArrayList;
import java.util.List;

public class Prime {
    public static void main(String[] args) {
        int n = 90;
        boolean isPrime;
        List<Integer> listPrime = new ArrayList<>();
        List<Integer> listinPrime = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            isPrime = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                listPrime.add(i);
            } else {
                listinPrime.add(i);
            }
        }

        System.out.println("Prime Numbers: " + listPrime);
        System.out.println("Non-Prime Numbers: " + listinPrime);
    }
}
