package com.fhlxc.spring.beanfactorydemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
* @author Xingchao Long
* @date 2020年1月27日 下午8:17:43
* @ClassName CusBeanPostProcessor
* @Description
*/

public class CusBeanPostProcessor implements BeanPostProcessor {
    
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization被调用");
        return bean;
    }
    
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization被调用");
        return bean;
    }
    
}
