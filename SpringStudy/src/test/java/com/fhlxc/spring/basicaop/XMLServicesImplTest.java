package com.fhlxc.spring.basicaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* @author Xingchao Long
* @date 2020年1月27日 下午10:06:43
* @ClassName XMLServicesImplTest
* @Description
*/

public class XMLServicesImplTest {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("xmlInterceptor.xml");
        IAOPServices services = (IAOPServices) context.getBean("serviceImplA");
        services.withAopMethod();
        services.withNoAopMethod();
    }

}
