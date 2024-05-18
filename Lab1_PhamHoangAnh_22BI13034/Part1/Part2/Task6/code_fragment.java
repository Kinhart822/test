package Lab1_PhamHoangAnh_22BI13034.Part1.Part2.Task6;

public class code_fragment {
    public static void main(String[] args) {
        int n = 1234567890;
        String s = "";
        for (int i = n; i > 0; i /= 2) {
            s = (i % 2) + s;
        }
        System.out.println(s);
    } 
}
    
