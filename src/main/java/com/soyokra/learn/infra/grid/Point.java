package com.soyokra.learn.infra.grid;

import lombok.Data;

@Data
public class Point <T>{
    Integer xNo;
    Integer yNo;
    T data;
}
