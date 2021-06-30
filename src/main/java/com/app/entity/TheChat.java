package com.app.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TheChat)实体类
 *
 * @author xsq
 * @since 2021-05-09 20:55:23
 */
public class TheChat implements Serializable {
    private static final long serialVersionUID = -87614807022954161L;
    
    private String chats;
    
    private Integer chatId;
    
    private String wxid;
    
    private Date chatTime;
    
    private String receiverid;


    public String getChats() {
        return chats;
    }

    public void setChats(String chats) {
        this.chats = chats;
    }

    public Integer getChatId() {
        return chatId;
    }

    public void setChatId(Integer chatId) {
        this.chatId = chatId;
    }

    public String getWxid() {
        return wxid;
    }

    public void setWxid(String wxid) {
        this.wxid = wxid;
    }

    public Date getChatTime() {
        return chatTime;
    }

    public void setChatTime(Date chatTime) {
        this.chatTime = chatTime;
    }

    public String getReceiverid() {
        return receiverid;
    }

    public void setReceiverid(String receiverid) {
        this.receiverid = receiverid;
    }

}