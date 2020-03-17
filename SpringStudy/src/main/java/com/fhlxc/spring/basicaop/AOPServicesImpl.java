package com.fhlxc.spring.basicaop;

/**
* @author Xingchao Long
* @date 2020年1月27日 下午8:39:25
* @ClassName AOPServicesImpl
* @Description
*/

public class AOPServicesImpl implements IAOPServices {

    private String description;
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String withAopMethod() throws Exception {
        System.out.println("AOP函数运行方法:withAopMethod");
        if (description.trim().length() == 0) {
            throw new Exception("description属性不能为空");
        }
        return description;
    }

    @Override
    public String withNoAopMethod() throws Exception {
        System.out.println("无AOP函数运行方法:withNoAopMethod");
        return description;
    }

}
