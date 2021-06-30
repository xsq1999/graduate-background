package com.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:yyz
 * Email:2562874272@qq.com
 * Date:2021/2/22
 **/
@RestController
@RequestMapping("/")
public class Index {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}

