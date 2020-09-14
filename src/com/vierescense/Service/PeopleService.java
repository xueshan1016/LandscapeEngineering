package com.vierescense.Service;

import com.vierescense.pojo.Goods;

import java.util.List;

/**
 * @author
 * 人员
 */
public interface PeopleService {
    List<Goods> findAllGoods();   //查询所有二手商品

    boolean buyGoods(int peopleId,int goodsId);  //购买货物

    Goods findGoodsById(int goodsId);  //根据货物id查询

    Goods findGoodsById(String goodsName); //根据名字查询
}
