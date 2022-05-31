package com.soyokra.learn.core.exception;


import com.soyokra.learn.core.enums.ExceptionEnum;

public class BaseException extends RuntimeException {
    protected Integer code;

    protected String message;

    public BaseException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum.getMessage());
        this.code = exceptionEnum.getCode();
        this.message = exceptionEnum.getMessage();
    }

    public BaseException(ExceptionEnum exceptionEnum, String message) {
        super(exceptionEnum.getMessage());
        this.code = exceptionEnum.getCode();
        this.message = message;
    }


    public BaseException(String message) {
        this(message, (Throwable)null);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
