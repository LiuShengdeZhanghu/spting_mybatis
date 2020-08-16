package com.liusheng.proxy;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

// 环绕通知，可以在核心之前和之后执行辅助功能
public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        // 在核心功能之前的辅助功能
        System.out.println("事务开始");
        Object ret = methodInvocation.proceed();  // 触发，执行核心功能
        System.out.println("事务结束");
        return ret;
    }
}
