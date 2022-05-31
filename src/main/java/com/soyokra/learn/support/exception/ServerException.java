package com.soyokra.learn.support.exception;

import com.soyokra.learn.support.exception.base.ExceptionEnum;

// 服务异常
public class ServerException extends BaseException{
    public ServerException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum);
    }
}
