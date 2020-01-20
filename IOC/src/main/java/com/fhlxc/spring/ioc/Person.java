package com.fhlxc.spring.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
* @author Xingchao Long
* @date 2020/40/19 17:40:27
* @ClassName Person
* @Description 
*/

@Component
public class Person {
    private IAir air;
    @Autowired
    public Person(@Qualifier("cleanair") IAir air) {
        this.air = air;
    }
    
    public void Breath() {
        System.out.println(this.air.toString());
    }
}
