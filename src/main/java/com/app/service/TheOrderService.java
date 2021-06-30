package com.app.service;

import com.app.entity.TheGoods;
import com.app.entity.TheOrder;
import java.util.List;

/**
 * (TheOrder)表服务接口
 *
 * @author xsq
 * @since 2021-04-19 15:50:40
 */
public interface TheOrderService {

    /**
     * 通过ID查询单条数据
     *
     * @param orderId 主键
     * @return 实例对象
     */
    TheOrder queryById(Integer orderId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TheOrder> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param theOrder 实例对象
     * @return 实例对象
     */
    TheOrder insert(TheOrder theOrder);

    /**
     * 修改数据
     *
     * @param theOrder 实例对象
     * @return 实例对象
     */
    TheOrder update(TheOrder theOrder);

    /**
     * 通过主键删除数据
     *
     * @param orderId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer orderId);

    List<TheOrder> selectAll();

    List<TheOrder> queryByarrive(String ifarrive);

    List<TheOrder> queryBywxid(String ifarrive,String wxid);

    List<TheOrder> queryBysender(String ifarrive,String senderId);
}