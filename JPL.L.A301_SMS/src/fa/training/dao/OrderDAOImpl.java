/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.dao;

import java.sql. *;
import java.util.ArrayList;
import java.util.List;
import fa.training.common.JDBCUtils;
import fa.training.entities.Order;

public class OrderDAOImpl implements OrderDAO {

	// CRUD - Retrieve
	@Override
	public Order get(int orderId) throws SQLException, ClassNotFoundException {
		Connection conn = JDBCUtils.getConnection(); 
		Order order = null;
		String sql = "SELECT order_id, order_date, customer_id, employee_id, total FROM dbo.Orders WHERE order_id = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, orderId);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			int oid = rs.getInt("order_id");
			Date od = rs.getDate("order_date");
			int cid = rs.getInt("customer_id");
			int eid = rs.getInt("employee_id");
			double t = rs.getDouble("total");
	
			order = new Order(oid, od, cid, eid, t);
		}
		return order;
	}

	// CRUD - Retrieve All
	@Override
	public List<Order> getAll() throws SQLException, ClassNotFoundException {
	    Connection conn = null;
	    PreparedStatement ps = null;
	    ResultSet rs = null;
	    List<Order> orders = new ArrayList<>();

	    try {
	        conn = JDBCUtils.getConnection();
	        String sql = "SELECT * FROM dbo.Orders";
	        ps = conn.prepareStatement(sql);
	        rs = ps.executeQuery();

	        while (rs.next()) {
	            int oid = rs.getInt("order_id");
	            Date od = rs.getDate("order_date");
	            int cid = rs.getInt("customer_id");
	            int eid = rs.getInt("employee_id");
	            double t = rs.getDouble("total");

	            Order order = new Order(oid, od, cid, eid, t);
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

	// CRUD - Create or Update
	@Override
	public boolean save(Order order) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	// CRUD - Create
	@Override
	public boolean addOrder(Order order) throws SQLException, ClassNotFoundException {
		PreparedStatement ps = null;
		Connection conn = null;
		int result;
		try {
			conn = JDBCUtils.getConnection();
			String sql = "INSERT INTO dbo.Orders (order_id, order_date, customer_id, employee_id, total) VALUES (?, ?, ?, ?, ?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, order.getOrderId());
			ps.setDate(2, order.getOrderDate());
			ps.setInt(3, order.getCustomerId());
			ps.setInt(4, order.getEmployeeId());
			ps.setDouble(5, order.getTotal());
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
	public boolean update(Order order) throws SQLException, ClassNotFoundException {
	    PreparedStatement ps = null;
	    Connection conn = null;
	    int result;
	    try {
	        conn = JDBCUtils.getConnection();
	        String sql = "UPDATE dbo.Orders SET order_date = ?, customer_id = ?, employee_id = ?, total = ? WHERE order_id = ?";
	        ps = conn.prepareStatement(sql);
	        ps.setDate(1, order.getOrderDate());
	        ps.setInt(2, order.getCustomerId());
	        ps.setInt(3, order.getEmployeeId());
	        ps.setDouble(4, order.getTotal());
	        ps.setInt(5, order.getOrderId());
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
	public boolean delete(Order order) throws ClassNotFoundException, SQLException {
		PreparedStatement ps = null;
	    Connection conn = null;
	    int result;
	    try {
	        conn = JDBCUtils.getConnection();
	        String sql = "DELETE FROM dbo.Orders WHERE order_id = ?";
	        ps = conn.prepareStatement(sql);
		    ps.setInt(1, order.getOrderId());
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

	// getAllOrdersByCustomerId
	@Override
	public List<Order> getAllOrdersByCustomerId(int customerId) throws SQLException, ClassNotFoundException {
		Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Order> orders = new ArrayList<>();

        try {
            conn = JDBCUtils.getConnection();
            String sql = "SELECT * FROM dbo.Orders WHERE customer_id = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, customerId);
            rs = ps.executeQuery();

            while (rs.next()) {
                int orderId = rs.getInt("order_id");
                Date orderDate = rs.getDate("order_date");
                int custId = rs.getInt("customer_id");
                int empId = rs.getInt("employee_id");
                double total = rs.getDouble("total");

                Order order = new Order(orderId, orderDate, custId, empId, total);
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
	
	// UpdateOrderTotal
	private static double newTotal; 

	public static void setNewTotal(double total) {
        newTotal = total;
    }
	
	@Override
	public boolean updateOrderTotal(int orderId) throws SQLException, ClassNotFoundException {
		PreparedStatement ps = null;
        Connection conn = null;
        int result;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "UPDATE dbo.Orders SET total = ? WHERE order_id = ?";
            ps = conn.prepareStatement(sql);
            ps.setDouble(1, newTotal);
            ps.setInt(2, orderId);
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

	// computeOrderTotal
	@Override
	public double computeOrderTotal(int orderId) throws SQLException, ClassNotFoundException {
		Connection conn = null;
        CallableStatement cs = null;
        double total = 0.0;
        
        try {
            conn = JDBCUtils.getConnection();
            cs = conn.prepareCall("{call ComputeOrderTotal(?, ?)}");
            cs.setInt(1, orderId);
            cs.registerOutParameter(2, Types.DECIMAL);
            cs.execute();
            total = cs.getDouble(2);
        } finally {
            if (cs != null) {
                cs.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        
        return total;
	}
	
	// 
}
