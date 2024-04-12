/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.entities;

public abstract class Person {
	private String name;
	private String gender;
	private String phoneNumber;
	private String email;
	
	public Person(String name, String gender, String phoneNumber, String email){
		this.name = name;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
		
// Getter - Setter
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
//	purchaseParking() method
	abstract void purchaseParking();
	
}





