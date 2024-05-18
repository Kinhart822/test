/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.entities;

public class Employee {

	// Private instance variables 
	private int employeeId;
	private String employeeName;
	private double salary;
	private int spvrId;
	
	// Constructor
	public Employee() {
        // Default constructor
    }
	
	public Employee(int employeeId, String employeeName, double salary, int spvrId) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.spvrId = spvrId;
	}
	
	// Getter and setter methods
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getSpvrId() {
		return spvrId;
	}
	public void setSpvrId(int spvrId) {
		this.spvrId = spvrId;
	}

	//
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", spvrId=" + spvrId + "]";
	}
	
	
}
