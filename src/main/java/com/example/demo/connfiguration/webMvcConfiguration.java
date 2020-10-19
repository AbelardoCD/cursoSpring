package com.example.demo.connfiguration;

import com.example.demo.components.requestTimeIntesrceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class webMvcConfiguration extends WebMvcConfigurerAdapter {
    @Autowired
    @Qualifier("requestTimeInterceptor")
    private requestTimeIntesrceptor requestime;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(requestime);
    }
}
