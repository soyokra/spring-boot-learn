package com.soyokra.learn.core.exception;


import com.soyokra.learn.core.enums.ExceptionEnum;

// 请求异常
public class ClientException extends BaseException {
    public ClientException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum);
    }

    public ClientException(ExceptionEnum exceptionEnum, String message) {
        super(exceptionEnum, message);
    }

    public ClientException(String message) {
        super(ExceptionEnum.CLIENT, message);
    }
}
