package com.app.dao;

import com.app.entity.TheGoods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TheGoods)表数据库访问层
 *
 * @author xsq
 * @since 2021-04-19 15:50:40
 */
@Mapper
public interface TheGoodsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param goodsId 主键
     * @return 实例对象
     */
    TheGoods queryById(Integer goodsId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TheGoods> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    List<TheGoods> queryAll();

    /**
     * 新增数据
     *
     * @param theGoods 实例对象
     * @return 影响行数
     */
    int insert(TheGoods theGoods);

    /**
     * 修改数据
     *
     * @param theGoods 实例对象
     * @return 影响行数
     */
    int update(TheGoods theGoods);

    /**
     * 通过主键删除数据
     *
     * @param goodsId 主键
     * @return 影响行数
     */
    int deleteById(Integer goodsId);

    TheGoods queryByName(String goodsName);
}