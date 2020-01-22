package com.fhlxc.spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
* @author Xingchao Long
* @date 2020/24/22 21:24:35
* @ClassName DynaProxyServiceA.java
* @Description 类描述
*/

public class DynaProxyServiceA implements InvocationHandler {

    private Object object;
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        return null;
    }

}
