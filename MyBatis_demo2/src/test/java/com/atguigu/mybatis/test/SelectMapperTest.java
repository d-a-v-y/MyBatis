package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.SelectMapper;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author Davy
 */
public class SelectMapperTest {

    /**
     * MyBatis的各种查询功能
     *
     * 1、若查询出的结果只有一条
     *      a>可以通过实体类对象接收
     *      b>可以通过list集合接收
     *      c>可以通过map集合接收
     *
     * 2、若查询出的数据有多条
     *      a>可以通过list集合来接收
     *      b>可以通过map类型的list集合来接收
     *      c>可以在mapper接口的方法上添加@MapKey注解，
     *      此时就可以将每条数据转换的map集合作为值，
     *      以某个字段的值作为键，放在同一个map集合中
     *
     *      注：一定不能通过实体类对象接收，否则抛异常
     *
     * MyBatis中设置了默认的类型别名
     *      java.lang.Integer --> int , integer
     *      int -->  _int , _integer
     *      Map --> map
     *      String --> string
     */

    @Test
    public void getAllUserToMap(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getAllUserToMap());
    }

    @Test
    public void getUserByIdToMap(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getUserByIdToMap(6));
    }

    @Test
    public void getCount(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getCount());
    }

    @Test
    public void getAllUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getAllUser());
    }

    @Test
    public void getUserById(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getUserById(6));
    }
}
