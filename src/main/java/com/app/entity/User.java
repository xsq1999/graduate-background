package com.app.entity;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author xsq
 * @since 2021-04-19 15:50:40
 */
public class User implements Serializable {
    private static final long serialVersionUID = -31963869494359701L;
    
    private String wxid;
    
    private String address;
    
    private Integer userType;
    
    private String orderId;
    
    private String wxName;
    
    private String phoneNumber;


    public String getWxid() {
        return wxid;
    }

    public void setWxid(String wxid) {
        this.wxid = wxid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getWxName() {
        return wxName;
    }

    public void setWxName(String wxName) {
        this.wxName = wxName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}