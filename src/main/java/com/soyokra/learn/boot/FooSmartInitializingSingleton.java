package com.soyokra.learn.boot;

import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.context.annotation.Configuration;

/**
 * @link https://zhuanlan.zhihu.com/p/151356774
 * 扩展点
 */
@Configuration
public class FooSmartInitializingSingleton implements SmartInitializingSingleton {
    @Override
    public void afterSingletonsInstantiated() {

    }
}
