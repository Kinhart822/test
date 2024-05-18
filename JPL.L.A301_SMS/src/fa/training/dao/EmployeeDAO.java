/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.dao;

import java.sql.SQLException;
import java.util.List;
import fa.training.entities.Employee;

public interface EmployeeDAO {
	Employee get(int employeeId) throws SQLException, ClassNotFoundException;

	List<Employee> getAll() throws SQLException, ClassNotFoundException;

	boolean save(Employee employee) throws SQLException;

	boolean insert(Employee employee) throws SQLException, ClassNotFoundException;

	boolean update (Employee employee) throws SQLException, ClassNotFoundException;

	boolean delete(Employee employee) throws ClassNotFoundException, SQLException;
}
