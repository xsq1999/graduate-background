package com.app.service.impl;

import com.app.entity.TheGoods;
import com.app.entity.TheOrder;
import com.app.dao.TheOrderDao;
import com.app.service.TheOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TheOrder)表服务实现类
 *
 * @author xsq
 * @since 2021-04-19 15:50:40
 */
@Service("theOrderService")
public class TheOrderServiceImpl implements TheOrderService {
    @Resource
    private TheOrderDao theOrderDao;

    /**
     * 通过ID查询单条数据
     *
     * @param orderId 主键
     * @return 实例对象
     */
    @Override
    public TheOrder queryById(Integer orderId) {
        return this.theOrderDao.queryById(orderId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TheOrder> queryAllByLimit(int offset, int limit) {
        return this.theOrderDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param theOrder 实例对象
     * @return 实例对象
     */
    @Override
    public TheOrder insert(TheOrder theOrder) {
        this.theOrderDao.insert(theOrder);
        return theOrder;
    }

    /**
     * 修改数据
     *
     * @param theOrder 实例对象
     * @return 实例对象
     */
    @Override
    public TheOrder update(TheOrder theOrder) {
        this.theOrderDao.update(theOrder);
        return this.queryById(theOrder.getOrderId());
    }

    /**
     * 通过主键删除数据
     *
     * @param orderId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer orderId) {
        return this.theOrderDao.deleteById(orderId) > 0;
    }

    @Override
    public List<TheOrder> queryByarrive(String ifarrive) {
        return this.theOrderDao.queryByarrive(ifarrive);
    }

    @Override
    public List<TheOrder> queryBywxid(String ifarrive, String wxid) {
        return this.theOrderDao.queryBywxid(ifarrive, wxid);
    }

    @Override
    public List<TheOrder> queryBysender(String ifarrive, String senderId) {
        return this.theOrderDao.queryBysender(ifarrive, senderId);
    }

    @Override
    public List<TheOrder> selectAll() {
        return theOrderDao.queryAll();
    }
}