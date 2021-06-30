package com.app.service;

import com.app.entity.TheChat;
import java.util.List;

/**
 * (TheChat)表服务接口
 *
 * @author xsq
 * @since 2021-05-09 20:55:23
 */
public interface TheChatService {

    /**
     * 通过ID查询单条数据
     *
     * @param chatId 主键
     * @return 实例对象
     */
    TheChat queryById(Integer chatId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TheChat> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param theChat 实例对象
     * @return 实例对象
     */
    TheChat insert(TheChat theChat);

    /**
     * 修改数据
     *
     * @param theChat 实例对象
     * @return 实例对象
     */
    TheChat update(TheChat theChat);

    /**
     * 通过主键删除数据
     *
     * @param chatId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer chatId);

    List<TheChat> queryByreceiver(String receiverid);

}