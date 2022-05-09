package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;

import java.util.List;

/**
 * @author Davy
 */
public interface UserMapper {

    /**
     * Mybatis面向接口编程的两个一致
     * 1、映射文件的namespace要和mapper接口的全类名保持一致
     * 2、映射文件中sql语句的ID要和mapper接口中的方法名一致
     */

    /**
     * 添加用户信息
     */
    int insertUser();

    /**
     * 修改用户信息
     */
    void updateUser();

    /**
     * 删除用户信息
     */
    void deleteUser();

    /**
     * 根据 id 查询用户信息
     */
    User getUserById();

    /**
     * 查询所有用户对象
     */
    List<User> getAllUser();
}
