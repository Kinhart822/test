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
import fa.training.entities.Product;

public class ProductDAOImpl implements ProductDAO{

	// CRUD - Retrieve
	@Override
	public Product get(int productId) throws SQLException, ClassNotFoundException {
		Connection conn = JDBCUtils.getConnection(); 
		Product product = null;
		String sql = "SELECT product_id, product_name, list_price FROM dbo.Product WHERE product_id = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, productId);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			int pd = rs.getInt("product_id");
			String pn = rs.getString("product_name");
			double lp = rs.getDouble("list_price");
			product = new Product(pd, pn, lp);
		}
		return product;
	}

	// CRUD - Retrieve All
	@Override
	public List<Product> getAll() throws SQLException, ClassNotFoundException {
		Connection conn = null;
	    PreparedStatement ps = null;
	    ResultSet rs = null;
	    List<Product> products = new ArrayList<>();

	    try {
	        conn = JDBCUtils.getConnection();
	        String sql = "SELECT * FROM dbo.Product";
	        ps = conn.prepareStatement(sql);
	        rs = ps.executeQuery();

	        while (rs.next()) {
	        	int pd = rs.getInt("product_id");
				String pn = rs.getString("product_name");
				double lp = rs.getDouble("list_price");
				Product product = new Product(pd, pn, lp);
				products.add(product);
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

	    return products;
	}

	// CRUD - Create or Update
	@Override
	public boolean save(Product product) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	// CRUD - Create
	@Override
	public boolean insert(Product product) throws SQLException, ClassNotFoundException {
		PreparedStatement ps = null;
		Connection conn = null;
		int result;
		try {
			conn = JDBCUtils.getConnection();
			String sql = "INSERT INTO dbo.Product (product_id, product_name, list_price) VALUES (?, ?, ?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, product.getProductId());
			ps.setString(2, product.getProductName());
			ps.setDouble(3, product.getListPrice());
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
	public boolean update(Product product) throws SQLException, ClassNotFoundException {
		PreparedStatement ps = null;
	    Connection conn = null;
	    int result;
	    try {
	        conn = JDBCUtils.getConnection();
	        String sql = "UPDATE dbo.Product SET product_name = ?, list_price = ? WHERE product_id = ?";
	        ps = conn.prepareStatement(sql);
	        ps.setString(1, product.getProductName());
	        ps.setDouble(2, product.getListPrice());
			ps.setInt(3, product.getProductId());
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
	public boolean delete(Product product) throws ClassNotFoundException, SQLException {
		PreparedStatement ps = null;
	    Connection conn = null;
	    int result;
	    try {
	        conn = JDBCUtils.getConnection();
	        String sql = "DELETE FROM dbo.Product WHERE product_id = ?";
	        ps = conn.prepareStatement(sql);
		    ps.setInt(1, product.getProductId());
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
