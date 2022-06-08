package com.soyokra.learn.support.util;


import java.util.Objects;

public class IDCardUtil {

    private String originNumber;


    public static IDCardUtil valueOf(Object number) {
        if (Objects.isNull(number)) {
            return new IDCardUtil("");
        }
        return new IDCardUtil(number.toString());
    }

    public static IDCardUtil valueOf(String number) {
        return new IDCardUtil(number);
    }

    public IDCardUtil(String number) {
        originNumber = number;
    }

    public boolean validate() {
        return false;
    }

}
