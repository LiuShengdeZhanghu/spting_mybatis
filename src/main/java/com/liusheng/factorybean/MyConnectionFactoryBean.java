package com.liusheng.factorybean;

import org.springframework.beans.factory.FactoryBean;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnectionFactoryBean implements FactoryBean<Connection> {
    // 该方法实现复杂对象的构建过程
    @Override
    public Connection getObject() throws Exception {
        // 加载驱动类
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/master?serverTimezone=GMT%2B8","root", "com/liusheng");
    }

    // 返回该对象的class
    @Override
    public Class<?> getObjectType() {
        return Connection.class;
    }

    // 是否是单例
    @Override
    public boolean isSingleton() {
        return false;
    }
}
