package com.app.controller;

import com.app.entity.TheStore;
import com.app.service.TheStoreService;
import org.apache.ibatis.annotations.Param;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TheStore)表控制层
 *
 * @author xsq
 * @since 2021-04-19 15:50:40
 */
@RestController
@RequestMapping("theStore")
public class TheStoreController {
    /**
     * 服务对象
     */
    @Resource
    private TheStoreService theStoreService;

    @GetMapping("selectbysell")
    public List<TheStore> selectOne(@Param("off")Integer off, @Param("lim")Integer lim) {
        return this.theStoreService.queryAllByLimit(off,lim);
    }


}