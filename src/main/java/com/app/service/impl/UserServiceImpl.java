package com.app.service.impl;

import com.app.entity.User;
import com.app.dao.UserDao;
import com.app.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表服务实现类
 *
 * @author xsq
 * @since 2021-04-19 15:50:40
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    /**
     * 通过ID查询单条数据
     *
     * @param wxid 主键
     * @return 实例对象
     */
    @Override
    public User queryById(String wxid) {
        return this.userDao.queryById(wxid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<User> queryAllByLimit(int offset, int limit) {
        return this.userDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User insert(User user) {
        this.userDao.insert(user);
        return user;
    }

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User update(User user) {
        this.userDao.update(user);
        return this.queryById(user.getWxid());
    }

    /**
     * 通过主键删除数据
     *
     * @param wxid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String wxid) {
        return this.userDao.deleteById(wxid) > 0;
    }

    @Override
    public User updateaddress(User user) {
        this.userDao.updateaddress(user);
        return this.queryById(user.getWxid());
    }

    @Override
    public List<User> queryAlluser() {
        return this.userDao.queryAlluser();
    }


    @Override
    public List<User> queryByroleId(Integer usertype) {
        return this.userDao.queryByroleId(usertype);
    }

    @Override
    public User updaterole(User user) {
        this.userDao.updaterole(user);
        return this.queryById(user.getWxid());
    }
}