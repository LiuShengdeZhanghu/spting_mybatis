package com.liusheng.proxy;

import org.springframework.aop.ThrowsAdvice;

// 在核心抛出异常时执行
public class MyThrowsAdvice implements ThrowsAdvice {

    public void afterThrowing(Exception ex){
        System.out.println("抛出异常");
    }
}
