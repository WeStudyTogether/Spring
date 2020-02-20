package com.fhlxc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
* @author Xingchao Long
* @date 2020年2月20日 下午5:28:10
* @ClassName IndexController
* @Description 
*/

@Controller
@RequestMapping("/index")
public class IndexController {
    
    @RequestMapping(value="/hello.do")
    public ModelAndView getTest(HttpServletRequest request) {
        return new ModelAndView("HelloWorld");
    }
    
}
