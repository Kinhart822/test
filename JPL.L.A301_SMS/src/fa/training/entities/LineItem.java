/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.entities;

public class LineItem {
	// Private instance variables
	private int orderId;
	private int productId;
	private int quantity;
	private double price;
	
	// Constructor
	public LineItem() {
        // Default constructor
    }

	public LineItem(int orderId, int productId, int quantity, double price) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.quantity = quantity;
		this.price = price;
	}

	// Getter and setter methods
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	//
	@Override
	public String toString() {
		return "LineItem [orderId=" + orderId + ", productId=" + productId + ", quantity=" + quantity + ", price="
				+ price + "]";
	}
	
	
	

}
