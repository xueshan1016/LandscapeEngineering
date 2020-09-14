package com.vierescense.Dao;

import com.vierescense.pojo.Order;

import java.util.List;

/**
 * @author
 * 订单表
 */
public interface OrderDao {

    int addOrder(Order order);  //添加

    int delOrder(int orderId);  //根据id删除

    Order updateOrder(int orderId); //根据id进行修改订单信息

    List<Order> findAllOrders(); //查询所有的订单

    Order findOrderById(int orderId); //根据id查找

    Order findOrderByName(int orderName); //根据名字查找
}
