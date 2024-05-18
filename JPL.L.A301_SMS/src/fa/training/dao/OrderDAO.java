/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.dao;

import java.sql.SQLException;
import java.util.List;
import fa.training.entities.Order;

public interface OrderDAO {
	Order get(int orderId) throws SQLException, ClassNotFoundException;

	List<Order> getAll() throws SQLException, ClassNotFoundException;

	boolean save(Order order) throws SQLException;

	boolean addOrder(Order order) throws SQLException, ClassNotFoundException;

	boolean update (Order order) throws SQLException, ClassNotFoundException;

	boolean delete(Order order) throws ClassNotFoundException, SQLException;

	boolean updateOrderTotal(int orderId) throws SQLException, ClassNotFoundException;

    List<Order> getAllOrdersByCustomerId(int customerId) throws SQLException, ClassNotFoundException;

    double computeOrderTotal(int orderId) throws SQLException, ClassNotFoundException;
}
