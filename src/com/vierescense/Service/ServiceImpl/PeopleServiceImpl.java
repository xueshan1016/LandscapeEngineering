package com.vierescense.Service.ServiceImpl;

import com.vierescense.Service.PeopleService;
import com.vierescense.pojo.Goods;

import java.util.List;

/**
 * @author
 * 人员
 */
public class PeopleServiceImpl implements PeopleService {


    @Override
    public List<Goods> findAllGoods() {
        return null;
    }
    
    @Override
    public boolean buyGoods(int peopleId, int goodsId) {
        return false;
    }

    @Override
    public Goods findGoodsById(int goodsId) {
        return null;
    }

    @Override
    public Goods findGoodsById(String goodsName) {
        return null;
    }
}
