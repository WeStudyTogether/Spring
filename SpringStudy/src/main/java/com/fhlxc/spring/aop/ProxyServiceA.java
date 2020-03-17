package com.fhlxc.spring.aop;

/**
* @author Xingchao Long
* @date 2020/18/22 21:18:58
* @ClassName ProxyServiceA.java
* @Description 类描述
*/

public class ProxyServiceA implements IService {
    private IService service;
    
    public ProxyServiceA(IService service) {
        super();
        this.service = service;
    }
    
    @Override
    public void service(String name) throws Exception {
        System.out.println("log start");
        try {
            service.service(name);
        } catch (Exception e) {
            throw e;
        }
        System.out.println("log end");
    }
    
    public static void main(String ... args) {
        IService service = new ServiceImplA();
        service = new ProxyServiceA(service);
        try {
            service.service("CYW");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
