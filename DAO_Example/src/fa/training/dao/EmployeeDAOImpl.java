/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import fa.training.common.JDBCUtils;
import fa.training.entities.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{

	// CRUD - Retrieve
	@Override
	public Employee get(int employeeId) throws SQLException, ClassNotFoundException {
		Connection conn = JDBCUtils.getConnection(); 
		Employee employee = null;
		String sql = "SELECT employee_id, employee_name, salary, supervisor_id FROM dbo.Employee WHERE employee_id = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, employeeId);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			int eid = rs.getInt("employee_id");
			String en = rs.getString("employee_name");
			double s = rs.getDouble("salary");
			int sid = rs.getInt("supervisor_id");
			employee = new Employee(eid, en, s, sid);
		}
		return employee;
	}

	// CRUD - Retrieve All
	@Override
	public List<Employee> getAll() throws SQLException, ClassNotFoundException {
		Connection conn = null;
	    PreparedStatement ps = null;
	    ResultSet rs = null;
	    List<Employee> employees = new ArrayList<>();

	    try {
	        conn = JDBCUtils.getConnection();
	        String sql = "SELECT * FROM dbo.Employee";
	        ps = conn.prepareStatement(sql);
	        rs = ps.executeQuery();

	        while (rs.next()) {
	        	int eid = rs.getInt("employee_id");
				String en = rs.getString("employee_name");
				double s = rs.getDouble("salary");
				int sid = rs.getInt("supervisor_id");
				Employee employee = new Employee(eid, en, s, sid);
				employees.add(employee);
	        }
	    } finally {
	    	if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}
			if (rs != null) {
				rs.close();
			}
	    }

	    return employees;
	}

	// CRUD - Create or Update
	@Override
	public boolean save(Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	// CRUD - Create
	@Override
	public boolean insert(Employee employee) throws SQLException, ClassNotFoundException {
		PreparedStatement ps = null;
		Connection conn = null;
		int result;
		try {
			conn = JDBCUtils.getConnection();
			String sql = "INSERT INTO dbo.Employee (employee_id, employee_name, salary, supervisor_id) VALUES (?, ?, ?, ?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, employee.getEmployeeId());
			ps.setString(2, employee.getEmployeeName());
			ps.setDouble(3, employee.getSalary());
			ps.setInt(4, employee.getSpvrId());
			result = ps.executeUpdate();
		} finally {
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
		return (result > 0);
	}

	// CRUD - Update
	@Override
	public boolean update(Employee employee) throws SQLException, ClassNotFoundException {
		PreparedStatement ps = null;
	    Connection conn = null;
	    int result;
	    try {
	        conn = JDBCUtils.getConnection();
	        String sql = "UPDATE dbo.Employee SET employee_name = ?, salary = ?, supervisor_id = ? WHERE employee_id = ?";
	        ps = conn.prepareStatement(sql);
			ps.setString(1, employee.getEmployeeName());
			ps.setDouble(2, employee.getSalary());
			ps.setInt(3, employee.getSpvrId());
	        ps.setInt(4, employee.getEmployeeId());
			result = ps.executeUpdate();
	    } finally {
	        if (ps != null) {
	            ps.close();
	        }
	        if (conn != null) {
	            conn.close();
	        }
	    }
	    return (result > 0);
	}

	// CRUD - Delete
	@Override
	public boolean delete(Employee employee) throws ClassNotFoundException, SQLException {
		PreparedStatement ps = null;
	    Connection conn = null;
	    int result;
	    try {
	        conn = JDBCUtils.getConnection();
	        String sql = "DELETE FROM dbo.Employee WHERE employee_id = ?";
	        ps = conn.prepareStatement(sql);
		    ps.setInt(1, employee.getEmployeeId());
	        result = ps.executeUpdate();
	    } finally {
	        if (ps != null) {
	            ps.close();
	        }
	        if (conn != null) {
	            conn.close();
	        }
	    }
	    return (result > 0);
	}

}
