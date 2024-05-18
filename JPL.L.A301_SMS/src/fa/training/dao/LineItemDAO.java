/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.dao;

import java.sql.SQLException;
import java.util.List;
import fa.training.entities.LineItem;

public interface LineItemDAO {
	LineItem get(int orderId, int productId) throws SQLException, ClassNotFoundException;

	List<LineItem> getAll() throws SQLException, ClassNotFoundException;

	boolean save(LineItem lineItem) throws SQLException;

	boolean addLineItem(LineItem lineItem) throws SQLException, ClassNotFoundException;

	boolean update (LineItem lineItem) throws SQLException, ClassNotFoundException;

	boolean delete(LineItem lineItem) throws ClassNotFoundException, SQLException;

	List<LineItem> getAllItemsByOrderId(int orderId) throws SQLException, ClassNotFoundException;
}
