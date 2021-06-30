package com.app.dao;

import com.app.entity.TheGoods;
import com.app.entity.TheOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TheOrder)表数据库访问层
 *
 * @author xsq
 * @since 2021-04-19 15:50:40
 */
@Mapper
public interface TheOrderDao {

    /**
     * 通过ID查询单条数据
     *
     * @param orderId 主键
     * @return 实例对象
     */
    TheOrder queryById(Integer orderId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TheOrder> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     *
     * @return 对象列表
     */
    List<TheOrder> queryAll();
    /**
     * 新增数据
     *
     * @param theOrder 实例对象
     * @return 影响行数
     */
    int insert(TheOrder theOrder);

    /**
     * 修改数据
     *
     * @param theOrder 实例对象
     * @return 影响行数
     */
    int update(TheOrder theOrder);

    /**
     * 通过主键删除数据
     *
     * @param orderId 主键
     * @return 影响行数
     */
    int deleteById(Integer orderId);

    List<TheOrder> queryByarrive(String ifarrive);

    List<TheOrder> queryBywxid(String ifarrive,String wxid);

    List<TheOrder> queryBysender(String ifarrive,String senderId);
}