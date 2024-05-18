package Lab1_PhamHoangAnh_22BI13034.Part1.Part2.Task4;

public class Distance {
    public static void main(String[] args) {
        // get x and y coordinates
        int x = 50;
        int y = 60;

        // calculate Euclidean distance
        double distance = Math.sqrt(x*x + y*y);

        // print the distance
        System.out.println("The Euclidean distance from the point (" + x + ", " + y + ") to the origin (0, 0) is " + distance + ".");
    }

}
