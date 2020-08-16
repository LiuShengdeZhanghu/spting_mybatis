package com.liusheng.test;

import com.liusheng.dao.UserDao;
import com.liusheng.entity.User;
import com.liusheng.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;


// 启动测试类时，会启动spring工厂，并且当前测试类也会变工厂生产
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-context.xml")
public class Mytest {

    // 注入
    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @Autowired
    @Qualifier("sqlSessionFactory")
    private SqlSessionFactory sqlSessionFactory;

    // 验证spring整合mybatis
    @Test
    public void demo1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) context.getBean("sqlSessionFactory");
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserDao mapper = sqlSession.getMapper(UserDao.class);

        List<User> users = mapper.queryUsers();
        users.forEach(System.out::println);
    }

    // 验证spring工厂去实现dao接口
    @Test
    public void demo2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");

        UserDao mapper = (UserDao) context.getBean("userDao");

        List<User> users = mapper.queryUsers();
        users.forEach(System.out::println);
    }

    // 验证spring工厂去实现service
    @Test
    public void demo3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");

        UserService service = (UserService) context.getBean("userService");

        List<User> users = service.queryUsers();
        users.forEach(System.out::println);
    }

    // 验证spring工厂去实现事务控制
    @Test
    public void demo4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");

        UserService service = (UserService) context.getBean("userService");

        User user = new User(null,"1234",new Date(),"test12","oo@oo.com",0,0,new Date(),"man","ss");

//        List<User> users = service.queryUsers();
//        users.forEach(System.out::println);
        int id = service.insertUser(user);
        System.out.println(id);
    }

    // 验证spring工厂去实现aop
    @Test
    public void demo5(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");

        UserService service = (UserService) context.getBean("userService");

        User user = new User(null,"1234",new Date(),"test12","oo@oo.com",0,0,new Date(),"man","ss");

        List<User> users = service.queryUsers();
        users.forEach(System.out::println);
//        int id = service.insertUser(user);
//        System.out.println(id);
    }

    // 验证spring集成junit
    @Test
    public void demo6(){
        User user = new User(null,"1234",new Date(),"test12","oo@oo.com",0,0,new Date(),"man","ss");

        List<User> users = userService.queryUsers();
        users.forEach(System.out::println);
//        int id = service.insertUser(user);
//        System.out.println(id);
    }

    // 验证spring集成junit
    @Test
    public void demo7(){
        User user = new User(null,"1234",new Date(),"test12","oo@oo.com",0,0,new Date(),"man","ss");

        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserDao mapper = sqlSession.getMapper(UserDao.class);

        List<User> users = mapper.queryUsers();
        users.forEach(System.out::println);
//        int id = service.insertUser(user);
//        System.out.println(id);
    }
}
