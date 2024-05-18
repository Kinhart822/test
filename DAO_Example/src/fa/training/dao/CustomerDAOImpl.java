/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import fa.training.common.JDBCUtils;
import fa.training.entities.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	// CRUD - Retrieve
	@Override
	public Customer get(int customerId) throws SQLException, ClassNotFoundException {
		Connection conn = JDBCUtils.getConnection(); 
		Customer customer = null;
		String sql = "SELECT customer_id, customer_name FROM dbo.Customer WHERE customer_id = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, customerId);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			int cid = rs.getInt("customer_id");
			String cn = rs.getString("customer_name");
			customer = new Customer(cid, cn);
		}
		return customer;
	}

	// CRUD - Retrieve All
	@Override
	public List<Customer> getAllCustomer() throws SQLException, ClassNotFoundException {
		Connection conn = null;
	    PreparedStatement ps = null;
	    ResultSet rs = null;
	    List<Customer> customers = new ArrayList<>();

	    try {
	        conn = JDBCUtils.getConnection();
	        String sql = "SELECT * FROM dbo.Customer";
	        ps = conn.prepareStatement(sql);
	        rs = ps.executeQuery();

	        while (rs.next()) {
	        	int cid = rs.getInt("customer_id");
				String cn = rs.getString("customer_name");
				Customer customer = new Customer(cid, cn);
				customers.add(customer);
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

	    return customers;
	}

	// CRUD - Create or Update
	@Override
	public boolean save(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	// CRUD - Create
	@Override
	public boolean insert(Customer customer) throws SQLException, ClassNotFoundException {
		PreparedStatement ps = null;
		Connection conn = null;
		int result;
		try {
			conn = JDBCUtils.getConnection();
			String sql = "INSERT INTO dbo.Customer (customer_id, customer_name) VALUES (?, ?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, customer.getCustomerId());
			ps.setString(2, customer.getCustomerName());
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
	public boolean update(Customer customer) throws SQLException, ClassNotFoundException {
		PreparedStatement ps = null;
	    Connection conn = null;
	    int result;
	    try {
	        conn = JDBCUtils.getConnection();
	        String sql = "UPDATE dbo.Customer SET customer_name = ? WHERE customer_id = ?";
	        ps = conn.prepareStatement(sql);
	        ps.setString(1, customer.getCustomerName());
			ps.setInt(2, customer.getCustomerId());
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
	public boolean delete(Customer customer) throws ClassNotFoundException, SQLException {
		PreparedStatement ps = null;
	    Connection conn = null;
	    int result;
	    try {
	        conn = JDBCUtils.getConnection();
	        String sql = "DELETE FROM dbo.Customer WHERE customer_id = ?";
	        ps = conn.prepareStatement(sql);
		    ps.setInt(1, customer.getCustomerId());
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

	// addCustomer
	@Override
	public boolean addCustomer(Customer customer) throws SQLException, ClassNotFoundException {
		CallableStatement cs = null;
        Connection conn = null;
        int result;
        try {
        	conn = JDBCUtils.getConnection();
            cs = conn.prepareCall("{CALL AddCustomer(?,?,?)}");
            cs.setInt(1, customer.getCustomerId());
            cs.setString(2, customer.getCustomerName());
            cs.registerOutParameter(3, Types.INTEGER);
            cs.execute();
            result = cs.getInt(3);
        } finally {
        	if (cs != null) {
	            cs.close();
	        }
	        if (conn != null) {
	            conn.close();
	        }
        }
        return (result > 0);
	}


	// updateCustomer
	@Override
	public boolean updateCustomer(Customer customer) throws SQLException, ClassNotFoundException {
		CallableStatement cs = null;
        Connection conn = null;
        int result;
	    try {
	    	conn = JDBCUtils.getConnection();
	        cs = conn.prepareCall("{CALL UpdateCustomer(?,?,?)}");
	        cs.setInt(1, customer.getCustomerId());
	        cs.setString(2, customer.getCustomerName());
	        cs.registerOutParameter(3, Types.INTEGER);
	        cs.execute();
	        result = cs.getInt(3);
	    } finally {
	    	if (cs != null) {
	            cs.close();
	        }
	        if (conn != null) {
	            conn.close();
	        }
	    }
	    return (result > 0);
	}

	// deleteCustomer
	@Override
	public boolean deleteCustomer(int customerId) throws SQLException, ClassNotFoundException {
		CallableStatement cs = null;
        Connection conn = null;
        int result;
        try {
            conn = JDBCUtils.getConnection();
            cs = conn.prepareCall("{CALL DeleteCustomer(?, ?)}");
            cs.setInt(1, customerId);
            cs.registerOutParameter(2, Types.INTEGER);
            cs.execute();
            result = cs.getInt(2);
        } finally {
            if (cs != null) {
                cs.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return (result > 0);
	}
	
	

}
