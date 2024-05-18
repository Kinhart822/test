/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session6;

public class Employee implements Comparable<Employee> {

	String name;
	Double salary;
	
	public Employee(String name, double i) {
		this.name = name;
		this.salary = i;
	}
	
	public String getName() {
		return name;
	}
	public Double getSalary() {
		return salary;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}	
	
	public String toString(){
		return "Employee(" + "name: " + name + ", salary: " + salary + "}";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		Employee employee1 = this;
		Employee employee2 = o;
		
		if (employee1.salary > employee2.salary) {
			return +1;
		} else if (employee1.salary < employee2.salary) {
			return -1;
		}
		return 0;
	}
	
}
