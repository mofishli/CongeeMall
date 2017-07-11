package com.congee.mall.aop;

import com.congee.mall.constants.BaseCode;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by zhouli on 17/7/10.
 */

@Component
@Aspect
@Configuration
public class MyAop {

//    @Pointcut("execution(com.congee.mall.*.*(..)")
//    public void join(){
//        System.out.printf("傻逼");
//    }


    //配置切入点,该方法无方法体,主要为方便同类中其他方法使用此处配置的切入点
    @Pointcut("execution(public * com.congee.mall.mq.*.*(..))")
    public void aspect(){
        System.out.println("啊哈哈哈哈1");
    }

    /*
     * 配置前置通知,使用在方法aspect()上注册的切入点
     * 同时接受JoinPoint切入点对象,可以没有该参数
     */
    @Before("aspect()")
    public void before(JoinPoint joinPoint){
        System.out.println("啊哈哈哈哈2");
    }

    //配置后置通知,使用在方法aspect()上注册的切入点
    @After("aspect()")
    public void after(ProceedingJoinPoint joinPoint){
        System.out.println("啊哈哈哈哈3");
    }

    //配置环绕通知,使用在方法aspect()上注册的切入点
    @Around("aspect()")
    public void around(ProceedingJoinPoint joinPoint){
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("啊哈哈哈哈4");
    }

    //配置后置返回通知,使用在方法aspect()上注册的切入点
    @AfterReturning("aspect()")
    public void afterReturn(ProceedingJoinPoint joinPoint){
        System.out.println("啊哈哈哈哈5");
    }

    //配置抛出异常后通知,使用在方法aspect()上注册的切入点
    @AfterThrowing(pointcut="aspect()", throwing="ex")
    public void afterThrow(ProceedingJoinPoint joinPoint, Exception ex){
        System.out.println("啊哈哈哈哈6");
    }

}
