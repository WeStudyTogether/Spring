package com.fhlxc.model;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

/**
* @author Xingchao Long
* @date 2020年2月28日 上午9:55:39
* @ClassName LoginIntercepter
* @Description 
*/

public class LoginIntercepter implements HandlerInterceptor {
    
    
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException, IOException {
        String requestURI = request.getRequestURI();
        if (requestURI.indexOf("/login") <= 0) {
            HttpSession session = request.getSession();
            User user = (User) session.getAttribute("user1");
            if (user != null) {
                return true;
            } else {
                request.getRequestDispatcher("view/index.jsp").forward(request, response);;
                return false;
            }
        } else {
            return true;
        }
    }
}
