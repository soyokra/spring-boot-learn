package com.soyokra.learn.api.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping(value = "/api/foo")
@RestController
public class FooController extends Controller {
    public void bar() {

    }
}
