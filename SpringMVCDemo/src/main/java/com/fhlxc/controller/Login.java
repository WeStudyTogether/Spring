package com.fhlxc.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fhlxc.model.User;

/**
* @author Xingchao Long
* @date 2020年2月23日 下午4:21:59
* @ClassName Login
* @Description 
*/

@Controller
public class Login {
    
    @RequestMapping("login.lxc")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response, @RequestParam("name")String name, 
            @RequestParam(value = "pwd", required = false) String pwd) {
        ModelAndView modelAndView = new ModelAndView("index");
        System.out.println("name: " + name + " pwd: " + pwd);
        return modelAndView;
    }
    
    @RequestMapping(value="getlogin/{name}/{pwd}", method=RequestMethod.GET)
    public ModelAndView getLogin(HttpServletRequest request, HttpServletResponse response,
            @PathVariable("name") String name,
            @PathVariable("pwd") String pwd) {
        ModelAndView modelAndView = new ModelAndView("index");
        System.out.println("name: " + name + " pwd: " + pwd);
        return modelAndView;
    }
    
    @RequestMapping(value = "login.do", method = RequestMethod.POST)
    public ModelAndView login2(HttpServletRequest request, HttpServletResponse response, 
            String name, String pwd) {
        ModelAndView modelAndView = new ModelAndView("index");
        System.out.println("name: " + name + " pwd1: " + pwd);
        return modelAndView;
    }
    
    @RequestMapping(value = "login.html")
    public ModelAndView login3(HttpServletRequest request, HttpServletResponse response, User user) {
        ModelAndView modelAndView = new ModelAndView("index");
        System.out.println("name:" + user.getName() + " pwd:" + user.getPwd());
        return modelAndView;
    }
    
    @RequestMapping(value = "login.htm")
    public ModelAndView login4(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        ModelAndView modelAndView = new ModelAndView("index");
        System.out.println("name: " + name + " pwd1: " + pwd);
        return modelAndView;
    }
    
    @RequestMapping(value = "login5.do")
    public ModelAndView login5(HttpServletRequest request, HttpServletResponse response, User user) {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("user", user);
        return modelAndView;
    }
}
