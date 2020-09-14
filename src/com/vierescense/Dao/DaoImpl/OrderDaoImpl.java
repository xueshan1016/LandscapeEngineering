package com.vierescense.Dao.DaoImpl;

import com.vierescense.Dao.OrderDao;
import com.vierescense.pojo.Order;

import java.util.List;

/**
 * @author cc
 * Data on  19:15
 */
public class OrderDaoImpl implements OrderDao {
    @Override
    public int addOrder(Order order) {
        return 0;
    }

    @Override
    public int delOrder(int orderId) {
        return 0;
    }

    @Override
    public Order updateOrder(int orderId) {
        return null;
    }

    @Override
    public List<Order> findAllOrders() {
        return null;
    }

    @Override
    public Order findOrderById(int orderId) {
        return null;
    }

    @Override
    public Order findOrderByName(int orderName) {
        return null;
    }
}
