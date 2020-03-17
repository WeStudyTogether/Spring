package com.fhlxc.spring.beanfactorydemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* @author Xingchao Long
* @date 2020/41/23 21:41:47
* @ClassName XmlCollectionsDemoTest
* @Description
*/

public class XmlCollectionsDemoTest {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BeanFactory factory = context;
        XmlCollectionsDemo annotationInstance = (XmlCollectionsDemo) factory.getBean("xmlCollectionsDemo");
        System.out.println(annotationInstance.getList());
        System.out.println(annotationInstance.getPros());
        System.out.println(annotationInstance.getSets());
        System.out.println(annotationInstance.getMaps());
        System.out.println(annotationInstance.getDate());
    }

}
