package com.soyokra.learn.core.exception.model;

public enum ExceptionModel {
    SUCCESS(0, "success"),
    CLIENT(400, "客户端错误"),
    SERVER(500, "服务器内部错误"),
    ;

    private Integer code;

    private String message;

    ExceptionModel(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
