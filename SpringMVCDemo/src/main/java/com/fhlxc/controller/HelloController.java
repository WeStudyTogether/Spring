package com.fhlxc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
* @author Xingchao Long
* @date 2020年2月22日 下午7:35:28
* @ClassName HelloController.java
* @Description 类描述
*/

public class HelloController extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {

        return new ModelAndView("HelloWorld");
    }

}
