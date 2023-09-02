package com.Lydia.blockdemo.interceptor;

import sun.net.httpserver.HttpServerImpl;

import java.util.Objects;

public class LoginInterceptor implements HandlerInterceptor{
    @Override
    public boolean preHandle(HttpServerRequest request, HttpServleResponse response, Object handler) throws Exception{
        if(request.getSession().getAttribute("uid")!=null){
            return true;
        }
        response.sendRedirect(request.getContextPath()+"login.html");
        return false;
    }
}
