package com.soyokra.learn.shop.support.grid;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Grid<X, Y, P> {
    List<Axis<X>> xAxisList;
    List<Axis<Y>> yAxisList;
    Map<Coord, Point<P>> pointMap;
}
