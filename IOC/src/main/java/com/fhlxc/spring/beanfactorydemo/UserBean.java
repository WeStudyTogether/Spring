package com.fhlxc.spring.beanfactorydemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
* @author Xingchao Long
* @date 2020/20/23 20:20:39
* @ClassName UserBean
* @Description
*/

public class UserBean implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean");
    }

    @Override
    public void setBeanFactory(BeanFactory arg0) throws BeansException {
        System.out.println(arg0);
    }

    @Override
    public void setBeanName(String arg0) {
        System.out.println(arg0);
    }

}
