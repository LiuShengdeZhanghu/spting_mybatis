package com.liusheng.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect   // 声明此类是一个切面类，会包含一个切入点(pointcut)和通知(advice)
@Component    // 声明组件，进入工厂
public class MyAspect {

    // 定义切入点
    @Pointcut("execution(* com.liusheng.service.UserServiceImpl.*(..))")
    public void pc(){}

    // 前置通知
//    @Before("pc()")
//    public void myBefore(JoinPoint a){
//        // JoinPoint是连接的
//        System.out.println("target: "+a.getTarget());  // 当前的目标是谁
//        System.out.println("args: "+a.getArgs());  // 当前方法的参数
//        System.out.println("method`s name: "+a.getSignature().getName());  // 当前调用方法的名称
//        System.out.println("before~~~~~~~~");
//    }

    // 前置通知
//    @AfterReturning(value = "pc()", returning = "ret")   // returning表示可以接收到核心方法的返回值
//    public void myAfterReturning(JoinPoint a, Object ret){
//        System.out.println("after~~~~~~~~"+ret);
//    }

    // 环绕通知
//    @Around("pc()")
//    public Object MyInterceptor(ProceedingJoinPoint p) throws Throwable {
//        System.out.println("Interceptor1~~~~~~~~");
//        Object ret = p.proceed();    // 执行核心功能
//        System.out.println("Interceptor2~~~~~~~~");
//        return ret;
//    }

    // 异常通知
    @AfterThrowing(value = "pc()",throwing = "ex")
    public void myThrows(JoinPoint jp, Exception ex){
        System.out.println("throws");
        System.out.println("===="+ex.getMessage());
    }
}
