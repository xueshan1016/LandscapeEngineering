package com.vierescense.Service;

import com.sun.org.apache.xpath.internal.operations.Or;
import com.vierescense.pojo.Goods;
import com.vierescense.pojo.Order;
import com.vierescense.pojo.Trash;

import java.util.List;

/**
 * @author
 * 企业
 */
public interface FirmService {

    Trash addTrash(Trash trash);  //添加垃圾

    Goods addGoods(Goods goods);  //添加二手商品

    int sentOrder(int orderId);  //发送指定订单

    List<Order> findAllOrder();  //查询企业的订单

    Order findOrderById(int orderId); //根据id查找订单
}
