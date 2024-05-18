package Lab1_PhamHoangAnh_22BI13034.Part1.Part2.Task4;

public class SumOfTwoDice {
    public static void main(String[] args) {
        // generate two random integers between 1 and 6
        int roll1 = 1 + (int) (Math.random() * 6);
        int roll2 = 1 + (int) (Math.random() * 6);

        // calculate the sum
        int sum = roll1 + roll2;

        // print the sum
        System.out.println("The sum of the two dice rolls is " + sum + ".");
    }
}
