package com.fhlxc.spring.beanfactorydemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.fhlxc.spring.ioc.IAir;

/**
* @author Xingchao Long
* @date 2020/13/24 16:13:54
* @ClassName AnnontationInstance
* @Description
*/

@Component
public class AnnontationInstance {

    @Value("abc")
    private String name;
    @Autowired
    @Qualifier(value="cleanair")
    private IAir air;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IAir getAir() {
        return air;
    }

    public void setAir(IAir air) {
        this.air = air;
    }
    
    public void breath() {
        System.out.println("Name: " + this.name + ";Air: " + this.air.toString());
    }
    
}
