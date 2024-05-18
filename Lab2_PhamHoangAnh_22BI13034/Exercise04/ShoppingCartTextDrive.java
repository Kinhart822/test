package Lab2_PhamHoangAnh_22BI13034.Exercise04;

import java.util.Scanner;

public class ShoppingCartTextDrive {
     public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Hãy nhập số món muốn mua");
            int n = input.nextInt();

            ShoppingCart cart = new ShoppingCart(n);
            cart.addToCart("Shoes");
            cart.addToCart("Hat");
            cart.addToCart("Pencil");
            cart.checkOut();
            cart.removeFromCart("Hat");
            cart.checkOut();
        }
    }
}