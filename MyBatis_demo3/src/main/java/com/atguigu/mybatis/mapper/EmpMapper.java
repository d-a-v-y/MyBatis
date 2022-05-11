package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;

import java.util.List;

/**
 * @author Davy
 */
public interface EmpMapper {

    /**
     * 查询所有的员工信息
     */
    List<Emp> getAllEmp();
}
