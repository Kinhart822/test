/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.problem03.models;

import java.sql.Date;

public class OrderDetail {
	// Private instance variables 
	private int order_id;
	private String product_id;
	private double unit_price;
    private int quantity;	
    private float discount;
	    
	// Constructor
    public OrderDetail() {
 
    }

	public OrderDetail(int order_id, String product_id, double unit_price, int quantity, float discount) {
        this.order_id = order_id;
        this.product_id = product_id;
	    this.unit_price = unit_price;
	    this.quantity = quantity;
	    this.discount = discount;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public double getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(double unit_price) {
		this.unit_price = unit_price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}
	
}
