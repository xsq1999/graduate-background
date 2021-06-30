package com.app.dao;

import com.app.entity.TheStore;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TheStore)表数据库访问层
 *
 * @author xsq
 * @since 2021-04-19 15:50:40
 */
@Mapper
public interface TheStoreDao {

    /**
     * 通过ID查询单条数据
     *
     * @param storeInformation 主键
     * @return 实例对象
     */
    TheStore queryById(String storeInformation);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TheStore> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param theStore 实例对象
     * @return 对象列表
     */
    List<TheStore> queryAll(TheStore theStore);

    /**
     * 新增数据
     *
     * @param theStore 实例对象
     * @return 影响行数
     */
    int insert(TheStore theStore);

    /**
     * 修改数据
     *
     * @param theStore 实例对象
     * @return 影响行数
     */
    int update(TheStore theStore);

    /**
     * 通过主键删除数据
     *
     * @param storeInformation 主键
     * @return 影响行数
     */
    int deleteById(String storeInformation);

}