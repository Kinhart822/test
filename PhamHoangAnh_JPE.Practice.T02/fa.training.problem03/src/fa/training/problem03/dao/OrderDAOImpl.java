/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.problem03.dao;

import fa.training.problem03.models.Order;
import fa.training.utils.JDBCUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderDAOImpl implements OrderDAO {
	public String save(Order order) throws ClassNotFoundException, SQLException {
		PreparedStatement ps = null;
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();
			String sql = "INSERT INTO dbo.Orders (order_id, customer_id, order_date, required_date, shipped_date, ship_address) VALUES  (?, ?, ?, ?, ?, ?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, order.getOrder_id());
			ps.setString(2, order.getCustomer_id());
			ps.setDate(3, order.getOrderDate());
			ps.setDate(4, order.getRequired_date());
			ps.setDate(5, order.getShipped_date());
			ps.setString(6, order.getShip_address());
			if (order.getRequired_date().compareTo(order.getOrderDate()) >= 0) {
				int rowsInserted = ps.executeUpdate();
				 if (rowsInserted > 0) {
					 return "success";
		         } else {
		             return "fail";
		         }
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


	@Override
	public List<Order> findOrderByCustomer(String customerId) throws ClassNotFoundException {
		Connection conn = null;
	    PreparedStatement ps = null;
	    ResultSet rs = null;
	    List<Order> orders = new ArrayList<>();

	    try {
	        conn = JDBCUtils.getConnection();
			String sql = "SELECT * FROM dbo.Orders WHERE customer_id = ?";	
	        ps = conn.prepareStatement(sql);
	        ps.setString(1, customerId);
	        rs = ps.executeQuery();

	        while (rs.next()) {
	            int orderId = rs.getInt("order_id");
	            Date orderDate = rs.getDate("order_date");
	            Date requiredDate = rs.getDate("required_date");
	            Date shippedDate = rs.getDate("shipped_date");
	            String shipAddress = rs.getString("ship_address");

	            Order order = new Order(orderId, orderDate, requiredDate, shippedDate, shipAddress);
	            orders.add(order);
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

	    return orders;
	}

	
}

