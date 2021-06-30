package com.app.service.impl;

import com.app.entity.TheChat;
import com.app.dao.TheChatDao;
import com.app.service.TheChatService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TheChat)表服务实现类
 *
 * @author xsq
 * @since 2021-05-09 20:55:23
 */
@Service("theChatService")
public class TheChatServiceImpl implements TheChatService {
    @Resource
    private TheChatDao theChatDao;

    /**
     * 通过ID查询单条数据
     *
     * @param chatId 主键
     * @return 实例对象
     */
    @Override
    public TheChat queryById(Integer chatId) {
        return this.theChatDao.queryById(chatId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TheChat> queryAllByLimit(int offset, int limit) {
        return this.theChatDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param theChat 实例对象
     * @return 实例对象
     */
    @Override
    public TheChat insert(TheChat theChat) {
        this.theChatDao.insert(theChat);
        return theChat;
    }

    /**
     * 修改数据
     *
     * @param theChat 实例对象
     * @return 实例对象
     */
    @Override
    public TheChat update(TheChat theChat) {
        this.theChatDao.update(theChat);
        return this.queryById(theChat.getChatId());
    }

    /**
     * 通过主键删除数据
     *
     * @param chatId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer chatId) {
        return this.theChatDao.deleteById(chatId) > 0;
    }


    @Override
    public List<TheChat> queryByreceiver(String receiverid) {
        return this.theChatDao.queryByreceiver(receiverid);
    }
}