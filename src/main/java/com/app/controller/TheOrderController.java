package com.app.controller;

import com.app.entity.TheGoods;
import com.app.entity.TheOrder;
import com.app.service.TheOrderService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

/**
 * (TheOrder)表控制层
 *
 * @author xsq
 * @since 2021-04-19 15:50:40
 */
@RestController
@RequestMapping("theOrder")
public class TheOrderController {
    /**
     * 服务对象
     */
    @Resource
    private TheOrderService theOrderService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOneorder")
    public TheOrder selectOneorder(
            @Param("id") Integer id) {
        return this.theOrderService.queryById(id);
    }

    @GetMapping("selectbyarrive")
    public List<TheOrder> selectbyarrive(
            @Param("ifarrive") String ifarrive) {
        return this.theOrderService.queryByarrive(ifarrive);
    }

    @GetMapping("selectbywxid")
    public List<TheOrder> selectbywxid(@Param("wxid") String wxid,
                                         @Param("ifarrive") String ifarrive) {
        return this.theOrderService.queryBywxid(ifarrive,wxid);
    }

    @GetMapping("updataOrder")
    public TheOrder updataOrder(@Param("order_id") Integer order_id,
                                @Param("ifarrive") String ifarrive,
                                @Param("wxid") String wxid,
                                @Param("order_time") String order_time,
                                @Param("sender_id") String sender_id,
                                @Param("arrive_time") String arrive_time,
                                @Param("goods") String goods,
                                @Param("price") Double price,
                                @Param("address") String address) {
        TheOrder theorder = new TheOrder();
        theorder.setOrderId(order_id);
        theorder.setWxid(wxid);
        theorder.setIfarrive(ifarrive);
        theorder.setAddress(address);
        theorder.setArriveTime(arrive_time);
        theorder.setOrderTime(order_time);
        theorder.setGoods(goods);
        theorder.setPrice(price);
        theorder.setSenderId(sender_id);
        System.out.println("theorder");
        return this.theOrderService.update(theorder);
    }

    @GetMapping("selectbysender")
    public List<TheOrder> selectbysender(@Param("senderId") String senderId,
                                       @Param("ifarrive") String ifarrive) {
        return this.theOrderService.queryBysender(ifarrive,senderId);
    }

    @GetMapping("selectallorder")
    public List<TheOrder> selectallorder() {
        return this.theOrderService.selectAll();
    }
}