package com.soyokra.learn.support.exception;

import com.soyokra.learn.support.exception.base.ExceptionEnum;

// 认证异常
public class AuthException extends BaseException {
    public AuthException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum);
    }
    public AuthException(ExceptionEnum exceptionEnum, String message) {
        super(exceptionEnum, message);
    }
}
