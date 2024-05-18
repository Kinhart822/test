package Lab1_PhamHoangAnh_22BI13034.Part1.Part2.Task3;

public class DoubleOps {
    public static void main(String[] args) {
        double a = 2.0;
        double b = 3.0;
        double sum  = a + b;
        double prod = a * b;
        double quot = a / b;
        double rem  = a % b;

        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " * " + b + " = " + prod);
        System.out.println(a + " / " + b + " = " + quot);
        System.out.println(a + " % " + b + " = " + rem);

        System.out.println();
        System.out.println("sin(pi/2) = " + Math.sin(Math.PI/2));
        System.out.println("log(e)    = " + Math.log(Math.E));
    } 
}
