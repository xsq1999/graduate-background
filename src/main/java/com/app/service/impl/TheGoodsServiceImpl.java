package com.app.service.impl;

import com.app.entity.TheGoods;
import com.app.dao.TheGoodsDao;
import com.app.service.TheGoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TheGoods)表服务实现类
 *
 * @author xsq
 * @since 2021-04-19 15:50:40
 */
@Service("theGoodsService")
public class TheGoodsServiceImpl implements TheGoodsService {
    @Resource
    private TheGoodsDao theGoodsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param goodsId 主键
     * @return 实例对象
     */
    @Override
    public TheGoods queryById(Integer goodsId) {
        return this.theGoodsDao.queryById(goodsId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TheGoods> queryAllByLimit(int offset, int limit) {
        return this.theGoodsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param theGoods 实例对象
     * @return 实例对象
     */
    @Override
    public TheGoods insert(TheGoods theGoods) {
        this.theGoodsDao.insert(theGoods);
        return theGoods;
    }

    /**
     * 修改数据
     *
     * @param theGoods 实例对象
     * @return 实例对象
     */
    @Override
    public TheGoods update(TheGoods theGoods) {
        this.theGoodsDao.update(theGoods);
        System.out.println("TheGoodsImpl " + theGoods.getGoodsId());
        return this.theGoodsDao.queryById(theGoods.getGoodsId());
    }

    /**
     * 通过主键删除数据
     *
     * @param goodsId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer goodsId) {
        return this.theGoodsDao.deleteById(goodsId) > 0;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param goodsname 主键
     * @return 实例对象
     */
    @Override
    public TheGoods queryByName(String goodsname) {
        return this.theGoodsDao.queryByName(goodsname);
    }

    @Override
    public List<TheGoods> selectAll() {
        return theGoodsDao.queryAll();
    }
}