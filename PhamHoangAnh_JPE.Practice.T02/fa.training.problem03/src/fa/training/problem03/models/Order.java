/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.problem03.models;

import java.sql.Date;

public class Order {
	// Private instance variables 
	private int order_id;
	private String customer_id;
    private Date orderDate;
    private Date required_date;
    private Date shipped_date;
    private String ship_address;
    
    // Constructor
    public Order() {
    }

    public Order(int order_id, String customer_id, Date orderDate, Date required_date, Date shipped_date, String ship_address) {
        this.order_id = order_id;
        this.customer_id = customer_id;
        this.orderDate = orderDate;
        this.required_date = required_date;
        this.shipped_date = shipped_date;
        this.ship_address = ship_address;
    }

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getRequired_date() {
		return required_date;
	}

	public void setRequired_date(Date required_date) {
		this.required_date = required_date;
	}

	public Date getShipped_date() {
		return shipped_date;
	}

	public void setShipped_date(Date shipped_date) {
		this.shipped_date = shipped_date;
	}

	public String getShip_address() {
		return ship_address;
	}

	public void setShip_address(String ship_address) {
		this.ship_address = ship_address;
	}
    
    

}
