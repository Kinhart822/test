package Lab1_PhamHoangAnh_22BI13034.Part1.Part2.Task5;

public class RandomPointInCircle {
    public static void main(String[] args) {
        double x, y;
        do {
            // Scale x and y to be random in (-1, 1).
            x = 2.0 * Math.random() - 1.0;
            y = 2.0 * Math.random() - 1.0;
        } while (x*x + y*y > 1.0);

        // print (x, y)
        System.out.println("(" + x + "," + y + ")");
    }
}
