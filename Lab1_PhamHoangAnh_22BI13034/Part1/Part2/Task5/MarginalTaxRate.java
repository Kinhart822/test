package Lab1_PhamHoangAnh_22BI13034.Part1.Part2.Task5;

public class MarginalTaxRate {

    public static void main(String[] args) {
        int income = 2;
        double rate = 0.0;

        if      (income <      0) rate = 0.00;
        else if (income <   8925) rate = 0.10;
        else if (income <  36250) rate = 0.15;
        else if (income <  87850) rate = 0.23;
        else if (income < 183250) rate = 0.28;
        else if (income < 398350) rate = 0.33;
        else if (income < 400000) rate = 0.35;
        else                      rate = 0.396;

        System.out.println("marginal tax rate = " + rate);
    }
}
