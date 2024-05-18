/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.problem03.dao;

import java.sql.SQLException;
import java.util.List;
import fa.training.problem03.models.Order;

public interface OrderDAO {
	String save(Order order) throws ClassNotFoundException, SQLException;
    List<Order> findOrderByCustomer(String customerId) throws ClassNotFoundException;
}
