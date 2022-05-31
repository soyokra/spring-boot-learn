package com.soyokra.learn.core.exception;

import com.soyokra.learn.core.enums.ExceptionEnum;

// 服务异常
public class ServerException extends BaseException{
    public ServerException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum);
    }
}
