/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("emp1", 1000));
		employees.add(new Employee("emp2", 1000));
		employees.add(new Employee("emp3", 1500));
		employees.add(new Employee("emp4", 2000));
		employees.add(new Employee("emp5", 1500));

		Map<Double, List<Employee>> map = new HashMap<>();
		for(Employee emp : employees) {
			Double salary = emp.getSalary();
			if(map.containsKey(salary)) {
				List<Employee> value = map.get(salary);
				value.add(emp);
			} else {
				List<Employee> employeesValue = new ArrayList<>();
				employeesValue.add(emp);
				map.put(salary, employeesValue);
				
			}
		}
		
		for(Map.Entry<Double, List<Employee>> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "----" + entry.getValue());
		}
		
		// Collections.sort(employee);
		Collections.sort(employees, new Comparator<Employee>() {
			@Override
			public int compare(Employee employee1, Employee employee2) {
				if(employee1.getSalary() > employee2.getSalary()) {
					return +1;
				} else if (employee1.getSalary() < employee2.getSalary()) {
					return -1;
				}
				// return 0
				// return -employee1.getName().compareTo(employee2.getName());
				return employee1.getName().compareTo(employee2.getName());
			}
		});
		System.out.println(employees);
		
		
	}
	

}
