package Lab1_PhamHoangAnh_22BI13034.Part1.Part2.Task5;

import java.util.ArrayList;
import java.util.List;

public class Factors {
    public static void main(String[] args) {
        int n = 2024;
        boolean isPrime;
        List<Integer> listPrime = new ArrayList<>();
        List<Integer> listinPrime = new ArrayList<>();
        List<Integer> listfactor = new ArrayList<>();
        

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

        for (int k = 0; k < listPrime.size(); k++) {
            while (n % listPrime.get(k) == 0) {
                listfactor.add(listPrime.get(k));
                n = n / listPrime.get(k);
            }
        }

        System.out.println("Prime Factors: " + listfactor);
    }
}

