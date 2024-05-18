/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.entities;

public class Product {
	
	// Private instance variables 
		private int productId;
		private String productName;
		private double listPrice;
		
	// Constructor
		public Product() {
	        // Default constructor
	    }
		
		public Product(int productId, String productName, double listPrice) {
			super();
			this.productId = productId;
			this.productName = productName;
			this.listPrice = listPrice;
		}

	// Getter and setter methods
		public int getProductId() {
			return productId;
		}

		public void setProductId(int productId) {
			this.productId = productId;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public double getListPrice() {
			return listPrice;
		}

		public void setListPrice(double listPrice) {
			this.listPrice = listPrice;
		}

	//
		@Override
		public String toString() {
			return "Product [productId=" + productId + ", productName=" + productName + ", listPrice=" + listPrice
					+ "]";
		}
	
		
		
}
