package com.fhlxc.spring.basicaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* @author Xingchao Long
* @date 2020年1月29日 上午11:17:17
* @ClassName AnnontationServicesImplTest
* @Description
*/

public class AnnontationServicesImplTest {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("annontationInterceptor.xml");
        IAOPServices services = (IAOPServices) context.getBean("serviceImplA");
        services.withAopMethod();
        services.withNoAopMethod();
    }

}
