package org.ccunix.eshop.utils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
* 前端跨域接口过滤器
* */
@WebFilter("/api/*")
public class AllowOriginFilterUtil implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //跨域
        System.out.println("--------------跨域处理-----------------");
        ((HttpServletResponse)servletResponse).setHeader("Access-Control-Allow-Origin","*");
        filterChain.doFilter(servletRequest,servletResponse);//通过继续执行其他过滤器或者其他控制器
    }

    @Override
    public void destroy() {

    }
}
