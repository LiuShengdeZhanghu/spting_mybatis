package com.liusheng.dao;

import com.liusheng.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserDao {

    // 通过用户的id，查询旅客信息及其护照信息  关联查询  级联查询
    public User queryUserById(@Param("id") int id);

    // 模糊查询
    public List<User> queryUserByLikeUsername(@Param("username") String username);

    public Integer deleteUserById(@Param("id") int id);

    public Integer updateUser(User user);

    public Integer insertUser(User user);

    // 通过用户的id，查询旅客信息及其护照信息  关联查询  级联查询
    public User queryUserPassportById(@Param("id") int id);

    // 多对多查询，查询出一个用户关注的所有话题
    public User queryUserTopicById(@Param("id") int id);

    // 查询所有的数据
    public List<User> queryUsers();


    // 批量删除
    public Integer deleteManyUser(List<Integer> list);

    // 批量添加
    public Integer insertManyUser(List<User> users);
}
