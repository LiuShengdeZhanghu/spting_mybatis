package com.liusheng.proxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

// 后处理器，一般不用我们自己写
public class MyBeanPostProcessor implements BeanPostProcessor {

    // 在工厂的init之前
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("后处理1");
        return bean;
    }

    // 在工厂的init之后
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("后处理2");
        return bean;
    }
}
