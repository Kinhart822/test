/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session8.DAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import session8.Employee;

public interface EmployeeDAO {
	boolean create(Employee employee) throws ClassNotFoundException;

    List<Employee> readAll() throws SQLException, ClassNotFoundException, IOException;

    Employee readById(int id) throws SQLException, ClassNotFoundException;

    boolean update(Employee employee);

    boolean delete(int id);

	int createAll(List<Employee> employees) throws ClassNotFoundException;
	
	int createAllByBatch(List<Employee> employees, int batchSize) throws ClassNotFoundException;

    List<Employee> readInfoAll() throws ClassNotFoundException, SQLException;

}
