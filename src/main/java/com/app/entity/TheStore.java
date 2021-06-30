package com.app.entity;

import java.io.Serializable;

/**
 * (TheStore)实体类
 *
 * @author xsq
 * @since 2021-04-19 15:50:40
 */
public class TheStore implements Serializable {
    private static final long serialVersionUID = 241427635907984219L;
    
    private String storeInformation;
    
    private String sale;


    public String getStoreInformation() {
        return storeInformation;
    }

    public void setStoreInformation(String storeInformation) {
        this.storeInformation = storeInformation;
    }

    public String getSale() {
        return sale;
    }

    public void setSale(String sale) {
        this.sale = sale;
    }

}