/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.utils;
import fa.training.problem03.dao.*;

import java.sql.SQLOutput;
import java.util.Map;
import java.util.Scanner;

public class Main {
	OrderDAO orderDAO = new OrderDAOImpl();
	OrderDetailDAO orderDetailDAO = new OrderDetailDAOImpl();


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Main management = new Main();

	    boolean flag = true;
	    while (flag) {
	    showMenu();
	    System.out.println("Enter your's choice");
	    int choice = scanner.nextInt();

		switch (choice) {
        case 1: {
        	management.orderDAO.save(order);
            break;
	    }
	    case 2: {
	    	System.out.println("Enter customer ID");
	    	String customerID = scanner.next();
	        management.orderDAO.findOrderByCustomer(customerID);
	        break;
	    }
	    case 3: {
	    	management.orderDetailDAO.save(order);
            break;
	    }
	    case 4: {
	        Map<String, Double> total = management.orderDetailDAO.reportOfSale();
	        System.out.println("reportOfSale: " + total);
	        break;
	    }
	    case 5: {
	    	flag = false;
	    }
	            }
	        }
	    }

	    private static void showMenu() {
	        System.out.println("1. Create a new order");
	        System.out.println("2. Create a new order detail");
	        System.out.println("3. Total money");
	        System.out.println("4. List order");
	        System.out.println("5) Exit application");
	    }
	    



}
