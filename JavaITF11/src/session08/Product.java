/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session08;

public class Product {
	String name;
	float price;
	String madeIn;
	short quantity;
	boolean isNew;
	float discount;
	
	public Product() {}
	
	public Product(String name, float price, String madeIn,short quantity,
			boolean isNew, float discount){
		this.name = name;
		this.price = price;
		this.madeIn = madeIn;
		this.quantity = quantity;
		this.isNew = isNew;
		this.discount = discount;

		
	}
	

}
