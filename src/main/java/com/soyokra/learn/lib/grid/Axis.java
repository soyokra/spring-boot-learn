package com.soyokra.learn.lib.grid;

import lombok.Data;

@Data
public class Axis<T> {
    private String id;
    private String name;
    T data;
}
