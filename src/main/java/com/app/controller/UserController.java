package com.app.controller;

import com.app.entity.User;
import com.app.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表控制层
 *
 * @author xsq
 * @since 2021-04-19 15:50:40
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public User selectOne(@Param("id") String id) {
        System.out.println(id);
        return this.userService.queryById(id);
    }

    @GetMapping("selectAlluser")
    public List<User> selectAlluser() {
        return this.userService.queryAlluser();
    }

    @GetMapping("updatauser")
    public User updatauser(@Param("wxid") String wxid,
                           @Param("address") String address,
                           @Param("wx_name") String wx_name,
                           @Param("phone_number") String phone_nameber) {
        User user = new User();
        user.setWxName(wx_name);
        user.setWxid(wxid);
        user.setAddress(address);
        user.setPhoneNumber(phone_nameber);
        return this.userService.updateaddress(user);
    }

    @GetMapping("selectroleid")
    public List<User> selectroleid(@Param("usertype") Integer usertype) {
        return this.userService.queryByroleId(usertype);
    }

    @GetMapping("updatarole")
    public User updatauser(@Param("wxid") String wxid,
                           @Param("usertype") Integer usertype) {
        User user = new User();
        user.setWxid(wxid);
        user.setUserType(usertype);
        return this.userService.updaterole(user);
    }
}