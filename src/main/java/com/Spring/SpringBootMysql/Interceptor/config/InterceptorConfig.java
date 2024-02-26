package com.Spring.SpringBootMysql.Interceptor.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.Spring.SpringBootMysql.Interceptor.MyInterceptor;
import com.Spring.SpringBootMysql.Interceptor.MyUserInterceptor;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {  //Intercept = memintas

    // basically, Interceptor function for check/edit/delete any request from user. 
    // we can use this interceptor function to block any sensitive request from user.
    
    @Override
   public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
        registry.addInterceptor(new MyUserInterceptor()).addPathPatterns("/users");
    }
}

//Can have interceptor for every path