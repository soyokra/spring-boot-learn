package com.soyokra.learn.shop.api.middleware.interceptor;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 拦截器
 *  本质上是面向切面编程（AOP）
 *  登录验证，判断用户是否登录
 *  权限验证，判断用户是否有权限访问资源，如校验token
 *  日志记录，记录请求操作日志（用户ip，访问时间等），以便统计请求访问量。
 *  处理cookie、本地化、国际化、主题等。
 *  性能监控，监控请求处理时长等。
 *  通用行为：读取cookie得到用户信息并将用户对象放入请求，从而方便后续流程使用，还有如提取Locale、Theme信息等，只要是多个处理器都需要的即可使用拦截器实现）
 */
public class FooInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
    }
}
