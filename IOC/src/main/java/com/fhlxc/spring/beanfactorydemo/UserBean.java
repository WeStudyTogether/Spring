package com.fhlxc.spring.beanfactorydemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;

/**
* @author Xingchao Long
* @date 2020/20/23 20:20:39
* @ClassName UserBean
* @Description
*/

public class UserBean implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {

    private String name;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
        System.out.println("set方法被调用");
    }
    
    public UserBean() {
        System.out.println("构造函数被调用");
    }
    
    public void myInit() {
        System.out.println("myInit被调用");
    }
    
    public void myDestroy() {
        System.out.println("myDestroy被调用");
    }
    
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext被调用");
    }
    
    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean被调用");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean被调用");
    }

    @Override
    public void setBeanFactory(BeanFactory arg0) throws BeansException {
        System.out.println("BeanFactoryAware被调用");
    }

    @Override
    public void setBeanName(String arg0) {
        System.out.println("BeanNameAware被调用");
    }

}
