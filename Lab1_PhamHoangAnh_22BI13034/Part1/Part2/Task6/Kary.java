package Lab1_PhamHoangAnh_22BI13034.Part1.Part2.Task6;

public class Kary {
    public static void main(String[] args) {
        int n = 1234567890;
        int k = 2;
        String s = "";
        while (n > 0) {
            int r = n % k;
            if (r < 10) {
                s = r + s;
            } else {
                s = (char) ('A' + r - 10) + s;
            }
            n = n / k;
        }
        System.out.println(s);
    }
}
