package com.soyokra.learn.lib.grid;

import lombok.Data;

@Data
public class Point <T>{
    Integer xNo;
    Integer yNo;
    T data;
}
