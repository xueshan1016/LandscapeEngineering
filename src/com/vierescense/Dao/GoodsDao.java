package com.vierescense.Dao;

import com.vierescense.pojo.Goods;
import com.vierescense.pojo.Order;

import java.util.List;

/**
 * @author
 * 二手货物
 */
public interface GoodsDao {
    int addGoods(Goods goods);  //添加

    int delGoods(int goodsId);  //根据id删除

    Goods updateGoods(int goodsId); //根据id进行修改货物信息

    List<Goods> findAllGoods(); //查询所有的货物

    Goods findGoodsById(int goodsId); //根据id查找
}
