package com.fhlxc.spring.aop;

/**
* @author Xingchao Long
* @date 2020/17/22 21:17:31
* @ClassName ServiceImplA.java
* @Description 类描述
*/

public class ServiceImplA implements IService {

    @Override
    public void service(String name) throws Exception {
        System.out.println("ServiceImplA name" + name);
    }

}
