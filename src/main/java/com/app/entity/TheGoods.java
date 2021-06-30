package com.app.entity;

import java.io.Serializable;

/**
 * (TheGoods)实体类
 *
 * @author xsq
 * @since 2021-04-19 15:50:40
 */
public class TheGoods implements Serializable {
    private static final long serialVersionUID = -83446424009662431L;
    
    private Integer goodsId;
    
    private String goodsName;
    
    private Double price;
    
    private String goodsImage;
    
    private String goodsBrand;
    
    private Integer goodsInventory;


    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage;
    }

    public String getGoodsBrand() {
        return goodsBrand;
    }

    public void setGoodsBrand(String goodsBrand) {
        this.goodsBrand = goodsBrand;
    }

    public Integer getGoodsInventory() {
        return goodsInventory;
    }

    public void setGoodsInventory(Integer goodsInventory) {
        this.goodsInventory = goodsInventory;
    }

    @Override
    public String toString() {
        return "TheGoods{" +
                "goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", price=" + price +
                ", goodsImage='" + goodsImage + '\'' +
                ", goodsBrand='" + goodsBrand + '\'' +
                ", goodsInventory=" + goodsInventory +
                '}';
    }
}