package Lab1_PhamHoangAnh_22BI13034.Part1.Part2.Task5;

public class PowersOfTwo {
    public static void main(String[] args) {
        int a = 3;
        int n = 6;
        int power = 1;
        int i = 1;
        while ( i <=n) {
            power = power * a;
            i++;      
        }
        System.out.println(power);

    }
    
}

