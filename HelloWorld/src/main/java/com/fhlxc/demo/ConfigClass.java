package com.fhlxc.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
* @author Xingchao Long
* @date 2020年3月3日 下午5:07:39
* @ClassName ConfigClass
* @Description 
*/

@Configuration
@ImportResource(locations = {"hello.xml"})
public class ConfigClass {

}
