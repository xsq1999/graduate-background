package com.app.service;

import com.app.entity.User;

import java.util.List;

/**
 * (User)表服务接口
 *
 * @author xsq
 * @since 2021-04-19 15:50:40
 */
public interface UserService {

    /**
     * 通过ID查询单条数据
     *
     * @param wxid 主键
     * @return 实例对象
     */
    User queryById(String wxid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<User> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    User insert(User user);

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    User update(User user);

    /**
     * 通过主键删除数据
     *
     * @param wxid 主键
     * @return 是否成功
     */
    boolean deleteById(String wxid);

    User updateaddress(User user);

    User updaterole(User user);

    List<User> queryAlluser();

    List<User> queryByroleId(Integer usertype);
}