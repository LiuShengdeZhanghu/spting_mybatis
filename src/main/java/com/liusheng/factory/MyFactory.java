package com.liusheng.factory;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

// 自定义工厂
// 1、加载配置文件
// 2、生产配置文件中记录的对应对象
public class MyFactory {

    private Properties properties = new Properties();

    public MyFactory(String config) throws IOException {
        InputStream inputStream = MyFactory.class.getResourceAsStream(config);
        properties.load(inputStream);
    }

    public Object getBean(String name) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 通过name获取类路径
        String class_path = properties.getProperty(name);
        // 通过路径进行反射获得类对象
        Class claz = Class.forName(class_path);
        Object o = claz.getDeclaredConstructor().newInstance();
        return o;
    }
}
