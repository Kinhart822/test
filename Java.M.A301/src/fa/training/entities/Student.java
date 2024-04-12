/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.entities;

public class Student extends Person{
	private String studentID;
	private double theory;
	private double practice;
	
	public Student(String name, String gender, String phoneNumber, String email, String studentID, double theory, double practice) {
		super(name, gender, phoneNumber, email);
		this.studentID = studentID;
		this.theory = theory;
		this.practice = practice;
	}
	
// Getter - Setter
	public String getStudentID() {
		return this.studentID;
	}
	public void setEmail(String studentID) {
		this.studentID = studentID;
	}
	
	public double getTheory() {
		return this.theory;
	}
	public void setTheory(double theory) {
		this.theory = theory;
	}
	
	public double getPractice() {
		return this.practice;
	}
	public void setPractice(double practice) {
		this.practice = practice;
	}
	
// calculateFinalMark() method
	public double calculateFinalMark() {
		return (this.theory + this.practice)/2;
	}

//	purchaseParking()
	@Override
	void purchaseParking() {}

}
