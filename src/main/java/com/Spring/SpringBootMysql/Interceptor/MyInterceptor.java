package com.Spring.SpringBootMysql.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor implements HandlerInterceptor {

   @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
        System.out.println("Pre-handle method is called"); //when the req is coming in, hit the controller, we can handle any sensitive transaction
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler , ModelAndView modelAndView) throws Exception{
        System.out.println("Post-handle method is called"); //when we accept the pre-handle process
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler , Exception ex) throws Exception{
        System.out.println("After completion method is called"); //for view after the response, user dah dpt response.

    }
}
