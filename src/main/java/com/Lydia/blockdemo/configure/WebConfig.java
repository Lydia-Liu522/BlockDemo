package com.Lydia.blockdemo.configure;

import com.Lydia.blockdemo.interceptor.LoginInterceptor;
import org.omg.PortableInterceptor.Interceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        InterceptorRegistration registration= registry.addInterceptors(new LoginInterceptor());
        registration.excludePathPatter(
                "/login.html",
                "/register.html",
                "/css/**",
                "/font/css",
                "/img/css",
                "/user/**"
        );
    }

}
