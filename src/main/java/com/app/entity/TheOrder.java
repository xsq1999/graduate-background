package com.app.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (TheOrder)实体类
 *
 * @author xsq
 * @since 2021-04-19 15:50:40
 */
@Data
public class TheOrder implements Serializable {
    private static final long serialVersionUID = 271674820174711383L;

    private Integer orderId;

    private String wxid;

    private String orderTime;

    private String senderId;

    private String arriveTime;

    private String goods;

    private Double price;

    private String address;

    private String ifarrive;


    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getWxid() {
        return wxid;
    }

    public void setWxid(String wxid) {
        this.wxid = wxid;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(String arriveTime) {
        this.arriveTime = arriveTime;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIfarrive() {
        return ifarrive;
    }

    public void setIfarrive(String ifarrive) {
        this.ifarrive = ifarrive;
    }

}