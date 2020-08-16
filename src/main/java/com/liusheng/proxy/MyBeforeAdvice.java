package com.liusheng.proxy;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class MyBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        // 额外功能，在业务之前进行
        System.out.println("事务控制");
        System.out.println("日志打印");
    }
}
