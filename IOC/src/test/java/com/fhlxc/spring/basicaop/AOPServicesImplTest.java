package com.fhlxc.spring.basicaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* @author Xingchao Long
* @date 2020年1月27日 下午9:11:00
* @ClassName AOPServicesImplTest
* @Description 
*/

public class AOPServicesImplTest {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("aopInterceptor.xml");
        IAOPServices services = (IAOPServices) context.getBean("aopService");
        services.withAopMethod();
        services.withNoAopMethod();
    }

}
