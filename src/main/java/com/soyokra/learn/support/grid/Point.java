package com.soyokra.learn.support.library.grid;

import lombok.Data;

@Data
public class Point <T>{
    Integer xNo;
    Integer yNo;
    T data;
}
