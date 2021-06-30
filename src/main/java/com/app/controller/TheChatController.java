package com.app.controller;

import com.app.entity.TheChat;
import com.app.service.TheChatService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TheChat)表控制层
 *
 * @author xsq
 * @since 2021-05-09 20:55:23
 */
@RestController
@RequestMapping("theChat")
public class TheChatController {
    /**
     * 服务对象
     */
    @Resource
    private TheChatService theChatService;


    @GetMapping("selectbyreceiver")
    public List<TheChat> selectbyreceiver(@Param("receiverid") String receiverid) {
        return this.theChatService.queryByreceiver(receiverid);
    }

}