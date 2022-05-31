package com.soyokra.learn.support.exception.base;

import com.soyokra.learn.support.exception.AuthException;
import com.soyokra.learn.support.exception.BaseException;
import com.soyokra.learn.support.library.std.StdResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Slf4j
@ControllerAdvice
public class ExceptionHandlers {
    @ExceptionHandler(value = BaseException.class)
    @ResponseBody
    public StdResponse<Object> baseException(HttpServletRequest request, BaseException e) {
        return StdResponse.error(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(value = AuthException.class)
    @ResponseBody
    public StdResponse<Object> authException(HttpServletRequest request, AuthException e) {
        return StdResponse.error(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public StdResponse<Object> exception(HttpServletRequest request, Exception e) {
        ExceptionEnum exceptionEnum = ExceptionEnum.SERVER;
        return StdResponse.error(exceptionEnum.getCode(), e.getMessage());
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    @ResponseBody
    public StdResponse<Object> methodArgumentNotValidException(HttpServletRequest request, MethodArgumentNotValidException e) {
        ExceptionEnum exceptionEnum = ExceptionEnum.CLIENT_VALIDATE;

        List<ObjectError> errorList = e.getBindingResult().getAllErrors();
        String message = "参数错误";
        for (ObjectError objectError: errorList) {
            message = objectError.getDefaultMessage();
            break;
        }
        return StdResponse.error(exceptionEnum.getCode(), message);
    }
}
