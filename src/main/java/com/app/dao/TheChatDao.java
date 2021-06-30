package com.app.dao;

import com.app.entity.TheChat;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TheChat)表数据库访问层
 *
 * @author xsq
 * @since 2021-05-09 20:55:23
 */
@Mapper
public interface TheChatDao {

    /**
     * 通过ID查询单条数据
     *
     * @param chatId 主键
     * @return 实例对象
     */
    TheChat queryById(Integer chatId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TheChat> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param theChat 实例对象
     * @return 对象列表
     */
    List<TheChat> queryAll(TheChat theChat);

    /**
     * 新增数据
     *
     * @param theChat 实例对象
     * @return 影响行数
     */
    int insert(TheChat theChat);

    /**
     * 修改数据
     *
     * @param theChat 实例对象
     * @return 影响行数
     */
    int update(TheChat theChat);

    /**
     * 通过主键删除数据
     *
     * @param chatId 主键
     * @return 影响行数
     */
    int deleteById(Integer chatId);

    List<TheChat> queryByreceiver(String receiver);

}