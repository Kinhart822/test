package Lab1_PhamHoangAnh_22BI13034.Part1.Part2.Task5;

public class HarmonicNumber {
    public static void main(String[] args) {
        int n = 7;
        double sum = 0;
        for (int i =1;i<=n;i++){
            sum = sum + 1.0/i;
        }
        System.out.println(sum);
    }
    
}