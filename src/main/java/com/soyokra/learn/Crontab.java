package com.soyokra.learn;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时任务
 */
@Component
public class Crontab {
    @Scheduled(initialDelay = 60_000, fixedRate = 60_000)
    public void foo() {

    }
}
