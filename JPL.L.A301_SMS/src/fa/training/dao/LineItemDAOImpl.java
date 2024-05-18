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
import fa.training.entities.LineItem;

public class LineItemDAOImpl implements LineItemDAO{
	
	// CRUD - Retrieve
	@Override
	public LineItem get(int orderId, int productId) throws SQLException, ClassNotFoundException {
		Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        LineItem lineItem = null;
        
        try {
            conn = JDBCUtils.getConnection(); 
            String sql = "SELECT order_id, product_id, quantity, price FROM dbo.LineItem WHERE order_id = ? AND product_id = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, orderId);
            ps.setInt(2, productId);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                int oid = rs.getInt("order_id");
                int pid = rs.getInt("product_id");
                int q = rs.getInt("quantity");
                double p = rs.getDouble("price");
                
                lineItem = new LineItem(oid, pid, q, p);
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
        return lineItem;
	}

	// CRUD - Retrieve All
	@Override
	public List<LineItem> getAll() throws SQLException, ClassNotFoundException {
		Connection conn = null;
	    PreparedStatement ps = null;
	    ResultSet rs = null;
	    List<LineItem> lineItems = new ArrayList<>();

	    try {
	        conn = JDBCUtils.getConnection();
	        String sql = "SELECT * FROM dbo.LineItem";
	        ps = conn.prepareStatement(sql);
	        rs = ps.executeQuery();

	        while (rs.next()) {
	        	int oid = rs.getInt("order_id");
                int pid = rs.getInt("product_id");
                int q = rs.getInt("quantity");
                double p = rs.getDouble("price");

                LineItem lineItem = new LineItem(oid, pid, q, p);
                lineItems.add(lineItem);
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

	    return lineItems;
	}

	// CRUD - Create or Update
	@Override
	public boolean save(LineItem lineItem) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	// CRUD - Create
	@Override
	public boolean addLineItem(LineItem lineItem) throws SQLException, ClassNotFoundException {
		PreparedStatement ps = null;
		Connection conn = null;
		int result;
		try {
			conn = JDBCUtils.getConnection();
			String sql = "INSERT INTO dbo.LineItem (order_id, product_id, quantity, price) VALUES (?, ?, ?, ?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, lineItem.getOrderId());
			ps.setInt(2, lineItem.getProductId());
			ps.setInt(3, lineItem.getQuantity());
			ps.setDouble(4, lineItem.getPrice());
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
	public boolean update(LineItem lineItem) throws SQLException, ClassNotFoundException {
	    PreparedStatement ps = null;
	    Connection conn = null;
	    int result;
	    try {
	        conn = JDBCUtils.getConnection();
	        String sql = "UPDATE dbo.LineItem SET quantity = ?, price = ? WHERE order_id = ? AND product_id = ?";
	        ps = conn.prepareStatement(sql);
	        ps.setInt(1, lineItem.getQuantity());
	        ps.setDouble(2, lineItem.getPrice());
	        ps.setInt(3, lineItem.getOrderId());
	        ps.setInt(4, lineItem.getProductId());
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
	public boolean delete(LineItem lineItem) throws ClassNotFoundException, SQLException {
		PreparedStatement ps = null;
	    Connection conn = null;
	    int result;
	    try {
	        conn = JDBCUtils.getConnection();
	        String sql = "DELETE FROM dbo.LineItem WHERE order_id = ? AND product_id = ?";
	        ps = conn.prepareStatement(sql);
		    ps.setInt(1, lineItem.getOrderId());
	        ps.setInt(2, lineItem.getProductId());
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

	// getAllItemsByOrderId
	@Override
	public List<LineItem> getAllItemsByOrderId(int orderId) throws SQLException, ClassNotFoundException {
	    Connection conn = null;
	    PreparedStatement ps = null;
	    ResultSet rs = null;
	    List<LineItem> lineItems = new ArrayList<>();

	    try {
	        conn = JDBCUtils.getConnection();
	        String sql = "SELECT * FROM dbo.LineItem WHERE order_id = ?";
	        ps = conn.prepareStatement(sql);
	        ps.setInt(1, orderId);
	        rs = ps.executeQuery();

	        while (rs.next()) {
	            int oid = rs.getInt("order_id");
	            int pid = rs.getInt("product_id");
	            int q = rs.getInt("quantity");
	            double p = rs.getDouble("price");

	            LineItem lineItem = new LineItem(oid, pid, q, p);
	            lineItems.add(lineItem);
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

	    return lineItems;
	}

	
}
