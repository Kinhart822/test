/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.dao;

import java.sql.SQLException;
import java.util.List;
import fa.training.entities.Customer;

public interface CustomerDAO {
	Customer get(int customerId) throws SQLException, ClassNotFoundException;

	List<Customer> getAllCustomer() throws SQLException, ClassNotFoundException;

	boolean save(Customer customer) throws SQLException;

	boolean insert(Customer customer) throws SQLException, ClassNotFoundException;

	boolean update (Customer customer) throws SQLException, ClassNotFoundException;

	boolean delete(Customer customer) throws SQLException, ClassNotFoundException;

	boolean addCustomer(Customer customer) throws SQLException, ClassNotFoundException;

    boolean updateCustomer(Customer customer) throws SQLException, ClassNotFoundException;

    boolean deleteCustomer(int customerId) throws SQLException, ClassNotFoundException;
}
