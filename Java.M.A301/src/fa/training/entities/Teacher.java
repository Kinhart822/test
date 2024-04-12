/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.entities;

public class Teacher extends Person {

	private double basicSalary;
	private double subsidy;
	
	public Teacher(String name, String gender, String phoneNumber, String email, double basicSalary, double subsidy ) {
		super(name, gender, phoneNumber, email);
		this.basicSalary = basicSalary;
		this.subsidy = subsidy;
	}
	
// Getter - Setter
	public double getBasicSalary() {
		return this.basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	public double getSubsidy() {
		return this.subsidy;
	}
	public void setSubsidy(double subsidy) {
		this.subsidy = subsidy;
	}

// calculateSalary() method
	public double calculateSalary() {
		return this.basicSalary + this.subsidy;
	}

//	purchaseParking()
	@Override
	void purchaseParking() {}

}
