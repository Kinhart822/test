/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.problem03.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import fa.training.problem03.models.OrderDetail;
import fa.training.utils.JDBCUtils;

public class OrderDetailDAOImpl implements OrderDetailDAO {

	@Override
	public String saveOrderDetail(OrderDetail orderDetail) throws ClassNotFoundException, SQLException {
		PreparedStatement ps = null;
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();
			String sql = "INSERT INTO dbo.OrderDetails (order_id, product_id, unit_price, quantity, discount) VALUES   (?, ?, ?, ?, ?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, orderDetail.getOrder_id());
			ps.setString(2, orderDetail.getProduct_id());
			ps.setDouble(3, orderDetail.getUnit_price());
			ps.setInt(4, orderDetail.getQuantity());
			ps.setFloat(5, orderDetail.getDiscount());
			int rowsInserted = ps.executeUpdate();
            if (rowsInserted > 0) {
                return "success";
            } else {
                return "fail";
            }
	  
		} finally {
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
	}

	public Map<String, Double> reportOfSale() throws ClassNotFoundException {
		Connection conn = null;
	    PreparedStatement ps = null;
	    ResultSet rs = null;
		Map<String, Double> customerTotal = new HashMap<>();
	    
	    try {
	    	conn = JDBCUtils.getConnection();
	    	String sql = "SELECT o.customer_id, SUM(od.unit_price * od.quantity) AS total_amount " +
		            "FROM dbo.Orders o " +
		            "INNER JOIN dbo.OrderDetails od ON o.order_id = od.order_id " +
		            "WHERE CONVERT(DATE, o.order_date) = CONVERT(DATE, GETDATE()) " +
		            "GROUP BY o.customer_id";
	        ps = conn.prepareStatement(sql);
	    	rs = ps.executeQuery();
	    	while (rs.next()) {
	            String customerId = rs.getString("customer_id");
	            double totalAmount = rs.getDouble("total_amount");
	            customerTotal.put(customerId, totalAmount);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace(); // Handle or log the exception appropriately
	    }
	    return customerTotal;
	}
	
}



