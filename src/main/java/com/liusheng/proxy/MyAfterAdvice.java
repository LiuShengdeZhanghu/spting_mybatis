package com.liusheng.proxy;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

// 在核心之后通知，如果有核心异常，则不执行
public class MyAfterAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("提交事务");
    }
}
