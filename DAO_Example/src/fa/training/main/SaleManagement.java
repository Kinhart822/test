/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.main;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import fa.training.dao.CustomerDAOImpl;
import fa.training.dao.EmployeeDAOImpl;
import fa.training.dao.LineItemDAOImpl;
import fa.training.dao.OrderDAOImpl;
import fa.training.dao.ProductDAOImpl;
import fa.training.entities.Customer;
import fa.training.entities.Employee;
import fa.training.entities.LineItem;
import fa.training.entities.Order;
import fa.training.entities.Product;

public class SaleManagement {

	public static void main(String[] args) throws SQLException, ClassNotFoundException{

//											------------------- Customer -------------------
		CustomerDAOImpl customerDAO = new CustomerDAOImpl();
		
		// Retrieve 
		Customer customer = customerDAO.get(1);
		System.out.println(customer);

//	Functional Requirements
//		---------------- 1 ----------------		
		
		// Retrieve All
		List<Customer> customers = new ArrayList<>();

		CustomerDAOImpl customerDAO1 = new CustomerDAOImpl();
		customers = customerDAO1.getAllCustomer();
		for (Customer customer1 : customers) {
			System.out.println(customer1);
		}
				
//		-----------------------------------	

		// INSERT INTO dbo.Customer
		customer = new Customer(4, "Customer D");
		try {
			boolean save121212 = customerDAO.insert(customer);
			System.out.println(save121212);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// UPDATE dbo.Customer
		customer = new Customer(4, "Customer X1");
		try {
			boolean save1212312 = customerDAO.update(customer);
			System.out.println(save1212312);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		// DELETE 
		customer = customerDAO.get(4);
		try {
			boolean save123412 = customerDAO.delete(customer);
			System.out.println(save123412);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
//	Functional Requirements
//		---------------- 5 ----------------	
		
		// addCustomer
		CustomerDAOImpl customerDAO122414 = new CustomerDAOImpl();
        
        Customer newCustomer = new Customer(5, "New Customer");
        try {
            boolean addResult = customerDAO122414.addCustomer(newCustomer);
            System.out.println(addResult);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        
//		-----------------------------------	
        
//	Functional Requirements
//		---------------- 7 ----------------	
        
    	// updateCustomer
		CustomerDAOImpl customerDAO122414334 = new CustomerDAOImpl();

        Customer updatedCustomer = new Customer(5, "Updated Customer");
        try {
            boolean updateResult = customerDAO122414334.updateCustomer(updatedCustomer);
            System.out.println(updateResult);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
		
//		-----------------------------------	
        
//    	Functional Requirements
//		---------------- 6 ----------------	

    	// deleteCustomer
		CustomerDAOImpl customerDAO122414324334 = new CustomerDAOImpl();
        int customerIdToDelete = 1; 
        try {
            boolean deleteResult = customerDAO122414324334.deleteCustomer(customerIdToDelete);
            System.out.println(deleteResult);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

//		-----------------------------------	

//											------------------- Employee -------------------
		EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();
		
		// Retrieve 
		Employee employee = employeeDAO.get(1);
		System.out.println(employee);
		
		// Retrieve All
		List<Employee> employees = new ArrayList<>();

		EmployeeDAOImpl employeeDAO1 = new EmployeeDAOImpl();
		employees = employeeDAO1.getAll();
		for (Employee employee1 : employees) {
			System.out.println(employee1);
		}
		
		// INSERT INTO dbo.Employee
		employee = new Employee(4, "Employee X1", 70000.00, 2);
		try {
			boolean save1212 = employeeDAO.insert(employee);
			System.out.println(save1212);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// UPDATE dbo.Product
		employee = new Employee(1, "Employee X", 65000.00, 1);
		try {
			boolean save12123 = employeeDAO.update(employee);
			System.out.println(save12123);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// DELETE 
		employee = employeeDAO.get(4);
		try {
			boolean save1234 = employeeDAO.delete(employee);
			System.out.println(save1234);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

//											------------------- Product --------------------
		ProductDAOImpl productDAO = new ProductDAOImpl();
		
		// Retrieve 
		Product product = productDAO.get(1);
		System.out.println(product);
		
		// Retrieve All
		List<Product> products = new ArrayList<>();

		ProductDAOImpl productDAO1 = new ProductDAOImpl();
		products = productDAO1.getAll();
		for (Product product1 : products) {
			System.out.println(product1);
		}
		
		// INSERT INTO dbo.Product
		product = new Product(4, "Product Alpha1", 400.00);
		try {
			boolean save12 = productDAO.insert(product);
			System.out.println(save12);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// UPDATE dbo.Product
		product = new Product(3, "Product Gamma", 300.00);
		try {
			boolean save123 = productDAO.update(product);
			System.out.println(save123);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// DELETE 
		product = productDAO.get(4);
		try {
			boolean save1234 = productDAO.delete(product);
			System.out.println(save1234);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
//												------------------- Orders -------------------
		OrderDAOImpl orderDAO = new OrderDAOImpl();

		// Retrieve 
		Order order = orderDAO.get(1);
		System.out.println(order);
		
		// Retrieve All
		List<Order> orders = new ArrayList<>();

		OrderDAOImpl orderDAO1 = new OrderDAOImpl();
		orders = orderDAO1.getAll();
		for (Order order1 : orders) {
			System.out.println(order1);
		}
		
//	Functional Requirements
//		---------------- 2 ----------------	
		
		// getAllOrdersByCustomerId
		OrderDAOImpl orderDAO12 = new OrderDAOImpl();

        int customerId = 3;
        try {
            List<Order> customerOrders = orderDAO12.getAllOrdersByCustomerId(customerId);
            System.out.println("Orders for Customer ID " + customerId + ":");
            for (Order order1233245 : customerOrders) {
                System.out.println(order1233245);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

//		-----------------------------------	
        
//    	Functional Requirements
//		---------------- 4 ----------------	
	    
		// computeOrderTotal
	    OrderDAOImpl orderDAO1343513 = new OrderDAOImpl();

        try {
            double orderTotal = orderDAO1343513.computeOrderTotal(3); 
            System.out.println("Order Total: " + orderTotal);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        
//		-----------------------------------	
	    
//	Functional Requirements
//		---------------- 8 ----------------		
		// INSERT INTO dbo.Orders
		String dateString = "2024-04-28"; 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date parsedDate = null;
		try {
			parsedDate = sdf.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		java.sql.Date sqlDate = new java.sql.Date(parsedDate.getTime());
		order = new Order(4, sqlDate, 3, 3, 500.00);
		try {
			boolean save = orderDAO.addOrder(order);
			System.out.println(save);
		} catch (SQLException | ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
//		-----------------------------------	

		// UPDATE dbo.Orders
		String dateString1 = "2024-04-29"; 
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date parsedDate1 = null;
		try {
			parsedDate1 = sdf1.parse(dateString1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		java.sql.Date sqlDate1 = new java.sql.Date(parsedDate1.getTime());
		order = new Order(4, sqlDate1, 1, 3, 600.00);
		try {
			boolean resultSave = orderDAO.update(order);
			System.out.println(resultSave);
		} catch (SQLException | ClassNotFoundException e2) {
			e2.printStackTrace();
		}
		
//	Functional Requirements
//		---------------- 10 ----------------	
		
		// UpdateOrderTotal
		int orderId = 4; 
	    double newTotal = 700.00; 
	    
	    OrderDAOImpl.setNewTotal(newTotal);
	    OrderDAOImpl orderDAO2 = new OrderDAOImpl(); 
	    try {
	        boolean success = orderDAO2.updateOrderTotal(orderId);
	        if (success) {
	            System.out.println("Success!");
	        } else {
	            System.out.println("Failed!");
	        }
	    } catch (SQLException | ClassNotFoundException e) {
	        e.printStackTrace();
	    }
		
//		-----------------------------------	

		// DELETE 
		order = orderDAO.get(4);
		try {
			boolean resultSave1 = orderDAO.delete(order);
			System.out.println(resultSave1);
		} catch (SQLException | ClassNotFoundException e3) {
			e3.printStackTrace();
		}

//												------------------- LineItem -------------------
		LineItemDAOImpl lineItemDAO = new LineItemDAOImpl();
		
		// Retrieve 
		LineItem lineItem = null;
		try {
			lineItem = lineItemDAO.get(1, 1);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace(); 
		}
		System.out.println(lineItem);
		
		// Retrieve All
		List<LineItem> lineItems = new ArrayList<>();
		
		LineItemDAOImpl lineItemDAO1 = new LineItemDAOImpl();
		lineItems = lineItemDAO1.getAll();
		for (LineItem lineItem1 : lineItems) {
			System.out.println(lineItem1);
		}
		
//	Functional Requirements
//		---------------- 3 ----------------
		int orderIdToRetrieve = 1; // Example order ID
        LineItemDAOImpl lineItemDAO12 = new LineItemDAOImpl();
        try {
            List<LineItem> lineItemsForOrder = lineItemDAO12.getAllItemsByOrderId(orderIdToRetrieve);
            System.out.println("Line items for Order ID " + orderIdToRetrieve + ":");
            for (LineItem lineItem1234532234 : lineItemsForOrder) {
                System.out.println(lineItem1234532234);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
		
//		-----------------------------------	

//	Functional Requirements
//		---------------- 9 ----------------	
		// INSERT INTO dbo.LineItem
		LineItem lineItem1 = new LineItem(2, 3, 2, 500.00);
		LineItem lineItem2 = new LineItem(3, 2, 3, 600.00);
		try {
			boolean save1 = lineItemDAO.addLineItem(lineItem1);
			boolean save2 = lineItemDAO.addLineItem(lineItem2);
			System.out.println("LineItem 1 saved: " + save1);
			System.out.println("LineItem 2 saved: " + save2);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
//		-----------------------------------	

		// UPDATE dbo.LineItem
		LineItem lineItem3 = new LineItem(1, 2, 1, 700.00);
		try {
		    boolean save3 = lineItemDAO.update(lineItem3);
		    System.out.println(save3);
		} catch (SQLException | ClassNotFoundException e) {
		    e.printStackTrace();
		}
		// DELETE 
		lineItem = lineItemDAO.get(1,1);
		try {
			boolean save4 = lineItemDAO.delete(lineItem);
			System.out.println(save4);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
