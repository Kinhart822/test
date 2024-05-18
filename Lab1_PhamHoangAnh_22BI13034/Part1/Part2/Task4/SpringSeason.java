package Lab1_PhamHoangAnh_22BI13034.Part1.Part2.Task4;

public class SpringSeason {
    public static void main(String[] args) {
        // get month and day
        int m = 4;
        int d = 23;

        // check if the date is between March 20 and June 20
        boolean isSpring = (m == 3 && d >= 20 && d <= 31)
                        || (m == 4 && d >= 1 && d <= 30)
                        || (m == 5 && d >= 1 && d <= 31)
                        || (m == 6 && d >= 1 && d <= 20);

        // print the result
        System.out.println(isSpring);
    }
}
