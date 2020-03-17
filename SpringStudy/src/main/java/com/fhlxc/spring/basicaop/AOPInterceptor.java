package com.fhlxc.spring.basicaop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

/**
* @author Xingchao Long
* @date 2020年1月27日 下午8:46:47
* @ClassName AOPInterceptor.java
* @Description 类描述
*/

public class AOPInterceptor implements AfterReturningAdvice, MethodBeforeAdvice, ThrowsAdvice {

    @Override
    public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
        System.out.println("执行MethodBeforeAdvice，即将执行的方法：" + arg0.getName());
        if (arg2 instanceof AOPServicesImpl) {
            String description = ((AOPServicesImpl) arg2).getDescription();
            if (description == null) {
                throw new NullPointerException("description属性不能为null");
            }
        }
    }

    @Override
    public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
        System.out.println("方法" + arg1.getName() + "运行方法结束，返回值为：" + arg0);
    }
    
    public void afterThrowing(Exception ex) {
        System.out.println("抛出了异常：" + ex.getMessage());
    }
    
    public void afterThrowing(Method method, Object[] args, Object target, Exception ex) {
        System.out.println("方法" + method.getName() + "抛出了异常：" + ex.getMessage());
    }

}
