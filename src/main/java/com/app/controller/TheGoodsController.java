package com.app.controller;

import com.app.entity.TheGoods;
import com.app.service.TheGoodsService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TheGoods)表控制层
 *
 * @author xsq
 * @since 2021-04-19 15:50:40
 */
@RestController
@RequestMapping("theGoods")
public class TheGoodsController {
    /**
     * 服务对象
     */
    @Resource
    private TheGoodsService theGoodsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TheGoods selectOne(@Param("id") Integer id) {
        return this.theGoodsService.queryById(id);
    }

    @GetMapping("selectall")
    public List<TheGoods> selectall() {
        return this.theGoodsService.selectAll();
    }

    @GetMapping("findId")
    public TheGoods findId(@Param("goods_name") String goods_name) {
        return this.theGoodsService.queryByName(goods_name);
    }

    @GetMapping("addOne")
    public TheGoods addOne(@Param("goods_name") String goods_name,
                           @Param("price") Double price,
                           @Param("goods_image") String goods_image,
                           @Param("goods_brand") String goods_brand,
                           @Param("goods_inventory") Integer goods_inventory) {
        TheGoods thegoods = new TheGoods();
        thegoods.setGoodsName(goods_name);
        thegoods.setPrice(price);
        thegoods.setGoodsImage(goods_image);
        thegoods.setGoodsBrand(goods_brand);
        thegoods.setGoodsInventory(goods_inventory);
        System.out.println(thegoods);
        return this.theGoodsService.insert(thegoods);
    }

    @GetMapping("updataOne")
    public TheGoods updataOne(@Param("goods_id") Integer goods_id,
                              @Param("goods_name") String goods_name,
                              @Param("price") Double price,
                              @Param("goods_image") String goods_image,
                              @Param("goods_brand") String goods_brand,
                              @Param("goods_inventory") Integer goods_inventory) {
        TheGoods thegoods = new TheGoods();
        thegoods.setGoodsId(goods_id);
        thegoods.setGoodsName(goods_name);
        thegoods.setPrice(price);
        thegoods.setGoodsImage(goods_image);
        thegoods.setGoodsBrand(goods_brand);
        thegoods.setGoodsInventory(goods_inventory);
        TheGoods tmp = this.theGoodsService.update(thegoods);
        return tmp;
    }

    @GetMapping("deleOne")
    public boolean deleOne(@Param("id") Integer id) {
        return this.theGoodsService.deleteById(id);
    }
}