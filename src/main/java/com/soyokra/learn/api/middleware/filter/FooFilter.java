package com.soyokra.learn.api.middleware.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * 过滤器
 * 过滤敏感词汇（防止sql注入）
 * 设置字符编码
 * URL级别的权限访问控制
 * 压缩响应信息
 */
public class FooFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }

    @Override
    public void destroy() {

    }
}
