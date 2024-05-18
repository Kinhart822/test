package Lab1_PhamHoangAnh_22BI13034.Part1.Part2.Task6;

public class FunctionGrowth {
    public static void main(String[] args){
        System.out.println("log n \tn \tn log n\tn^2 \tn^3");
        for(int n = 16; n <= 2048; n *= 2){
            double lnN = Math.log(n);
            double nlnN = n * Math.log(n);
            double nSquared = Math.pow(n, 2);
            double nCubed = Math.pow(n, 3);
            double TwoPowerN = Math.pow(2, n);

            System.out.println(n + "\t" + lnN + "\t" + nlnN + "\t" + nSquared + "\t" + nCubed + "\t" + TwoPowerN);
        }
    }
}
