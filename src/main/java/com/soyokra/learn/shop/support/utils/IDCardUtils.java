package com.soyokra.learn.shop.support.utils;


import java.util.Objects;

public class IDCardUtils {

    private String originNumber;


    public static IDCardUtils valueOf(Object number) {
        if (Objects.isNull(number)) {
            return new IDCardUtils("");
        }
        return new IDCardUtils(number.toString());
    }

    public static IDCardUtils valueOf(String number) {
        return new IDCardUtils(number);
    }

    public IDCardUtils(String number) {
        originNumber = number;
    }

    public boolean validate() {
        return false;
    }

}
