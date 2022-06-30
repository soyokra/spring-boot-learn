package com.soyokra.learn.shop.domain.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 启动时执行
 */
@Component
@Order(1)
public class FooCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

    }
}
