package com.vierescense.pojo;

import java.util.Date;

/**
 * @author 订单信息
 */
public class Order {
    private int orderId;    //订单编号
    private int orderGoodsId;   //商品订单编号
    private int orderPeopleId;  //用户id
    private Date orderDate; //上交订单时间

    public Order() {
    }

    public Order(int orderId, int orderGoodsId, int orderPeopleId, Date orderDate) {
        this.orderId = orderId;
        this.orderGoodsId = orderGoodsId;
        this.orderPeopleId = orderPeopleId;
        this.orderDate = orderDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderGoodsId() {
        return orderGoodsId;
    }

    public void setOrderGoodsId(int orderGoodsId) {
        this.orderGoodsId = orderGoodsId;
    }

    public int getOrderPeopleId() {
        return orderPeopleId;
    }

    public void setOrderPeopleId(int orderPeopleId) {
        this.orderPeopleId = orderPeopleId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderGoodsId=" + orderGoodsId +
                ", orderPeopleId=" + orderPeopleId +
                ", orderDate=" + orderDate +
                '}';
    }
}
