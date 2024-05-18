package fa.training.problem03.dao;

import fa.training.problem03.models.Order;
import java.sql.SQLException;
import java.util.List;

public interface OrderDAO {
    String saveOrder(Order order) throws ClassNotFoundException, SQLException;
    List<Order> findOrderByCustomer(String customerId) throws ClassNotFoundException, SQLException;
}
