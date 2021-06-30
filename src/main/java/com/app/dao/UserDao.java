package com.app.dao;

import com.app.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (User)表数据库访问层
 *
 * @author xsq
 * @since 2021-04-19 15:50:40
 */
@Mapper
public interface UserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param wxid 主键
     * @return 实例对象
     */
    User queryById(String wxid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<User> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param user 实例对象
     * @return 对象列表
     */
    List<User> queryAll(User user);

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 影响行数
     */
    int insert(User user);

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 影响行数
     */
    int update(User user);

    /**
     * 通过主键删除数据
     *
     * @param wxid 主键
     * @return 影响行数
     */
    int deleteById(String wxid);

    int updateaddress(User user);

    int updaterole(User user);

    List<User> queryAlluser();

    List<User> queryByroleId(Integer usertype);

}