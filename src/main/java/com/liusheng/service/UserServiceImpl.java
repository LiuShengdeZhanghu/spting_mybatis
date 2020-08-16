package com.liusheng.service;

import com.liusheng.dao.UserDao;
import com.liusheng.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import java.util.List;


/**
 * Service等于去spring配置文件中写了bean标签，
 * 在工厂中的id为类名的首字母小写，也可以传入一个字符串参数作为id
 * Scope指定bean的创建方式为单例还是多例，单例为默认方式，多例需要传入prototype参数
 * service不需要多例
 */
//@Service
@Service("userService")
//@Scope("prototype")
@Scope
@Transactional(propagation = Propagation.REQUIRED)
public class UserServiceImpl implements UserService {

//    @Autowired // 根据工厂中相同类型自动注入
//    @Resource(name = "userDao")       // 根据工厂中名称相同自动注入
//    @Resource
    // 这个表示基于类型的自动注入，并挑选beanid=userDao的bean
    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<User> queryUsers() {
        System.out.println("query users");
//        int i = 1/0;
        return userDao.queryUsers();
    }

    @Override
    public Integer insertUser(User user) {
        userDao.insertUser(user);
//        int i = 10/0;
        return user.getId();
    }

    public UserDao getUserDao() { return userDao; }

    public void setUserDao(UserDao userDao) { this.userDao = userDao; }
}
