/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.utils;

import fa.training.problem03.dao.OrderDAO;
import fa.training.problem03.dao.OrderDAOImpl;
import fa.training.problem03.dao.OrderDetailDAO;
import fa.training.problem03.dao.OrderDetailDAOImpl;
import fa.training.problem03.models.Order;
import fa.training.problem03.models.OrderDetail;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private final OrderDAO orderDAO = new OrderDAOImpl();
    private final OrderDetailDAO orderDetailDAO = new OrderDetailDAOImpl();

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        try (Scanner input = new Scanner(System.in)) {
            Main management = new Main();

            boolean flag = true;
            while (flag) {
                showMenu();
                System.out.println("Enter your choice:");
                int choice = input.nextInt();
                input.nextLine();  // consume newline

                switch (choice) {
                    case 1: {
                        System.out.println("Enter order ID:");
                        int orderId = input.nextInt();
                        input.nextLine(); 
                        System.out.println("Enter customer ID:");
                        String customerId = input.nextLine();
                        System.out.println("Enter order date (yyyy-MM-dd):");
                        String orderDateString = input.nextLine();
                        System.out.println("Enter required date (yyyy-MM-dd):");
                        String requiredDateString = input.nextLine();
                        System.out.println("Enter shipped date (yyyy-MM-dd):");
                        String shippedDateString = input.nextLine();
                        System.out.println("Enter ship address:");
                        String shipAddress = input.nextLine();

                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        Date orderDate = null;
                        Date requiredDate = null;
                        Date shippedDate = null;
                        try {
                            orderDate = new Date(sdf.parse(orderDateString).getTime());
                            requiredDate = new Date(sdf.parse(requiredDateString).getTime());
                            shippedDate = new Date(sdf.parse(shippedDateString).getTime());
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }

                        Order order = new Order(orderId, customerId, orderDate, requiredDate, shippedDate, shipAddress);
                        String result = management.orderDAO.saveOrder(order);
                        System.out.println("Order creation result: " + result);
                        break;
                    }
                    case 2: {
                        System.out.println("Enter customer ID:");
                        String customerID = input.nextLine();
                        List<Order> orders = management.orderDAO.findOrderByCustomer(customerID);
                        System.out.println("Orders for customer ID " + customerID + ":");
                        for (Order order : orders) {
                            System.out.println(order);
                        }
                        break;
                    }
                    case 3: {
                        System.out.println("Enter order ID:");
                        int orderId = input.nextInt();
                        input.nextLine();
                        System.out.println("Enter product ID:");
                        String productId = input.nextLine();
                        System.out.println("Enter unit price:");
                        double unitPrice = input.nextDouble();
                        System.out.println("Enter quantity:");
                        int quantity = input.nextInt();
                        System.out.println("Enter discount:");
                        float discount = input.nextFloat();

                        OrderDetail orderDetail = new OrderDetail(orderId, productId, unitPrice, quantity, discount);
                        String result = management.orderDetailDAO.saveOrderDetail(orderDetail);
                        System.out.println("Order detail creation result: " + result);
                        break;
                    }
                    case 4: {
                        System.out.println("Generating sales report...");
                        Map<String, Double> total = management.orderDetailDAO.reportOfSale();
                        System.out.println("Sales report: " + total);
                        break;
                    }
                    case 5: {
                        flag = false;
                        System.out.println("Exiting application...");
                        break;
                    }
                    default: {
                        System.out.println("Invalid choice! Please choose again.");
                        break;
                    }
                }
            }
        }
    }

    private static void showMenu() {
        System.out.println("1. Create a new order");
        System.out.println("2. List orders by customer ID");
        System.out.println("3. Create a new order detail");
        System.out.println("4. Generate sales report");
        System.out.println("5. Exit application");
    }
}
