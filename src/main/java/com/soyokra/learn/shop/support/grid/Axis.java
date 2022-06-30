package com.soyokra.learn.shop.support.grid;

import lombok.Data;

@Data
public class Axis<T> {
    private String id;
    private String name;
    T data;
}
