package com.fhlxc.controller;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.fhlxc.model.User;

/**
* @author Xingchao Long
* @date 2020年2月23日 下午4:21:59
* @ClassName Login
* @Description 
*/

@SessionAttributes({"user1"})
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
    
    @RequestMapping(value = "login.do")
    public ModelAndView login2(HttpServletRequest request, HttpServletResponse response, 
            String name, String pwd) {
        ModelAndView modelAndView = new ModelAndView("ajax");
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
    
    @RequestMapping(value = "testModel.do")
    public String testModel (Model model) {
        User user1 = new User();
        user1.setName("abc");
        user1.setPwd("123456");
        model.addAttribute("user1", user1);
        return "index";
    }
    
    @RequestMapping("test.do")
    public ModelAndView getTest(HttpServletRequest request) {
        return new ModelAndView("HelloWorld");
    }
    
    @RequestMapping("testModelAttribute")
    public String testModelAttribute(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("use") User user,
            @ModelAttribute("name") String name, Model model) {
        user.setName("addd");
        user.setPwd("12345678");
        name = "TestModelAttribute";
        model.addAttribute("user", user);
        model.addAttribute("name", name);
        return "index";
    }
    
    @ModelAttribute(value = "mymap")
    public Map<String, Object> map() {
        User user = new User();
        user.setName("dfdfs");
        user.setPwd("dfs");
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("user", user);
        return map;
    }
    
    @ModelAttribute
    public void voidmap(Model model) {
        User user = new User();
        user.setName("dfdfs");
        user.setPwd("dfdsfss");
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("user", user);
        model.addAttribute("voidmap", map);
    }
    
    @RequestMapping(value = "requestbodybind.do", method = RequestMethod.POST)
    @ResponseBody
    public User requestBodyBind(@RequestBody User user1) {
        System.out.println("requestbodybind:" + user1);
        return user1;
    }
}
