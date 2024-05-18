package Lab1_PhamHoangAnh_22BI13034.Part1.Part2.Task4;

public class SumOfSines {
    public static void main(String[] args) {
        // get t in degrees
        double t = Double.parseDouble(args[0]);

        // convert t to radians
        double tRadians = Math.toRadians(t);

        // calculate the value of sin(2t) + sin(3t)
        double sumOfSines = Math.sin(2 * tRadians) + Math.sin(3 * tRadians);

        // print the value
        System.out.println("The value of sin(2t) + sin(3t) is " + sumOfSines + ".");
    }
}
