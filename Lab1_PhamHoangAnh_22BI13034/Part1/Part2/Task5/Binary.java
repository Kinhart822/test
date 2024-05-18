package Lab1_PhamHoangAnh_22BI13034.Part1.Part2.Task5;
import java.util.ArrayList;
import java.util.List;


public class Binary {
    public static void main(String[] args) {
        int a = 108;
        //int phanNguyen = a / 2;
        //int phanDu = a % 2;
        List<Integer> list = new ArrayList<>();
        while (a!=0) {
            //a=a/2;
            list.add(a%2);
            a = a/2;           
        }
       for (int i = list.size() - 1; i >= 0; i--){
        System.out.print(list.get(i));
       }        
    }   
}
