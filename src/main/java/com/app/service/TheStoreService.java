package com.app.service;

import com.app.entity.TheStore;
import java.util.List;

/**
 * (TheStore)表服务接口
 *
 * @author xsq
 * @since 2021-04-19 15:50:40
 */
public interface TheStoreService {

    /**
     * 通过ID查询单条数据
     *
     * @param storeInformation 主键
     * @return 实例对象
     */
    TheStore queryById(String storeInformation);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TheStore> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param theStore 实例对象
     * @return 实例对象
     */
    TheStore insert(TheStore theStore);

    /**
     * 修改数据
     *
     * @param theStore 实例对象
     * @return 实例对象
     */
    TheStore update(TheStore theStore);

    /**
     * 通过主键删除数据
     *
     * @param storeInformation 主键
     * @return 是否成功
     */
    boolean deleteById(String storeInformation);

}