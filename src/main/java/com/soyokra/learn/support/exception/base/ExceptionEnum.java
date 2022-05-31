package com.soyokra.learn.support.exception.base;

public enum ExceptionEnum {
    SUCCESS(0, "success"),

    CLIENT(4010000, "客户端错误"),
    AUTH(4010001, "认证错误"),
    AUTH_LOGIN(4010002, "用户名或密码错误"),
    AUTH_TOKEN(4010003, "token认证错误"),
    AUTH_PERMISSION(4010004, "权限错误"),
    CLIENT_EXISTS(4010005, "数据已存在"),
    CLIENT_NOT_EXISTS(4010006, "数据不存在"),
    CLIENT_VALIDATE(4010007, "参数错误"),

    SERVER(50010000, "服务器内部错误"),
    ;

    private final Integer code;

    private final String message;

    ExceptionEnum(Integer code, String message) {
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
