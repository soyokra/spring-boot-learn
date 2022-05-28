package com.soyokra.learn.core.exception.handler;

import com.soyokra.learn.infra.std.StdResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 异常全局处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public StdResponse<Object> exception(HttpServletRequest request, Exception e) {
        ExceptionEntity exceptionEntity = ExceptionEntity.SERVER;
        return StdResponse.error(exceptionEntity.getCode(), e.getMessage());
    }
}
