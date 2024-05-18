/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.dao;

import java.sql.SQLException;
import java.util.List;
import fa.training.entities.Product;

public interface ProductDAO {
	Product get(int productId) throws SQLException, ClassNotFoundException;

	List<Product> getAll() throws SQLException, ClassNotFoundException;

	boolean save(Product product) throws SQLException;

	boolean insert(Product product) throws SQLException, ClassNotFoundException;

	boolean update (Product product) throws SQLException, ClassNotFoundException;

	boolean delete(Product product) throws ClassNotFoundException, SQLException;
}
