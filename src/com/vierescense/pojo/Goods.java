package com.vierescense.pojo;

/**
 * @author
 * 二手商品
 */
public class Goods {
    private int goodsId;    //商品编号
    private String goodName;    //商品名称
    private String goodsDes;    //商品描述
    private int goodsPrice;     //商品价格
    private int goodsFirmId;    //企业编号
    private int goodsPepId;     //用户id

    public Goods() {
    }

    public Goods(int goodsId, String goodName, String goodsDes, int goodsPrice, int goodsFirmId, int goodsPepId) {
        this.goodsId = goodsId;
        this.goodName = goodName;
        this.goodsDes = goodsDes;
        this.goodsPrice = goodsPrice;
        this.goodsFirmId = goodsFirmId;
        this.goodsPepId = goodsPepId;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getGoodsDes() {
        return goodsDes;
    }

    public void setGoodsDes(String goodsDes) {
        this.goodsDes = goodsDes;
    }

    public int getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(int goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public int getGoodsFirmId() {
        return goodsFirmId;
    }

    public void setGoodsFirmId(int goodsFirmId) {
        this.goodsFirmId = goodsFirmId;
    }

    public int getGoodsPepId() {
        return goodsPepId;
    }

    public void setGoodsPepId(int goodsPepId) {
        this.goodsPepId = goodsPepId;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", goodName='" + goodName + '\'' +
                ", goodsDes='" + goodsDes + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", goodsFirmId=" + goodsFirmId +
                ", goodsPepId=" + goodsPepId +
                '}';
    }
}
