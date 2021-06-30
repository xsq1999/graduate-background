package com.app.service;

import com.app.entity.TheGoods;
import java.util.List;

/**
 * (TheGoods)表服务接口
 *
 * @author xsq
 * @since 2021-04-19 15:50:40
 */
public interface TheGoodsService {

    /**
     * 通过ID查询单条数据
     *
     * @param goodsId 主键
     * @return 实例对象
     */
    TheGoods queryById(Integer goodsId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TheGoods> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param theGoods 实例对象
     * @return 实例对象
     */
    TheGoods insert(TheGoods theGoods);

    /**
     * 修改数据
     *
     * @param theGoods 实例对象
     * @return 实例对象
     */
    TheGoods update(TheGoods theGoods);

    /**
     * 通过主键删除数据
     *
     * @param goodsId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer goodsId);
    //TheGoods queryByName(TheGoods theGoods);

    TheGoods queryByName(String goodsname);

    List<TheGoods> selectAll();
}