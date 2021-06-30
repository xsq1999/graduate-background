package com.app.service.impl;

import com.app.entity.TheStore;
import com.app.dao.TheStoreDao;
import com.app.service.TheStoreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TheStore)表服务实现类
 *
 * @author xsq
 * @since 2021-04-19 15:50:40
 */
@Service("theStoreService")
public class TheStoreServiceImpl implements TheStoreService {
    @Resource
    private TheStoreDao theStoreDao;

    /**
     * 通过ID查询单条数据
     *
     * @param storeInformation 主键
     * @return 实例对象
     */
    @Override
    public TheStore queryById(String storeInformation) {
        return this.theStoreDao.queryById(storeInformation);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TheStore> queryAllByLimit(int offset, int limit) {
        return this.theStoreDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param theStore 实例对象
     * @return 实例对象
     */
    @Override
    public TheStore insert(TheStore theStore) {
        this.theStoreDao.insert(theStore);
        return theStore;
    }

    /**
     * 修改数据
     *
     * @param theStore 实例对象
     * @return 实例对象
     */
    @Override
    public TheStore update(TheStore theStore) {
        this.theStoreDao.update(theStore);
        return this.queryById(theStore.getStoreInformation());
    }

    /**
     * 通过主键删除数据
     *
     * @param storeInformation 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String storeInformation) {
        return this.theStoreDao.deleteById(storeInformation) > 0;
    }
}