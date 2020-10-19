package com.example.demo.components;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.slf4j.ILoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component("requestTimeInterceptor")
public class requestTimeIntesrceptor extends HandlerInterceptorAdapter {
    private static final Log LOG = LogFactory.getLog(requestTimeIntesrceptor.class);

    /*Se ejecuta primero*/
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       request.setAttribute("startTime",System.currentTimeMillis());
       return true;
    }
    /*Se ejecuta segundo*/

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        Long startime = (Long) request.getAttribute("startTime");
        LOG.info(".. REQUEST URL :" +request.getRequestURL().toString() +"-- Total Time:"+(System.currentTimeMillis()-startime) + " ms");
    }
}
