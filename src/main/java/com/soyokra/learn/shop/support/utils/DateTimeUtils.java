package com.soyokra.learn.shop.support.utils;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * 标准时间
 * String-Format & Long-Timestamp
 */
public class DateTimeUtils {

    public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

    private final Long value;

    private final ZoneId zoneId;

    public DateTimeUtils(Long value, ZoneId zoneId) {
        this.value = value;
        this.zoneId = zoneId;
    }

    public static DateTimeUtils valueOf(String date) {
        // todo
        return null;
    }

    public static DateTimeUtils valueOf(LocalDate localDate) {
        ZoneId zoneId = ZoneId.systemDefault();
        return valueOf(localDate, zoneId);
    }

    public static DateTimeUtils valueOf(LocalDate localDate, ZoneId zoneId) {
        return valueOf(localDate.atStartOfDay(), zoneId);
    }

    public static DateTimeUtils valueOf(LocalDateTime localDateTime) {
        ZoneId zoneId = ZoneId.systemDefault();
        return valueOf(localDateTime.atZone(zoneId).toEpochSecond(), zoneId);
    }

    public static DateTimeUtils valueOf(LocalDateTime localDateTime, ZoneId zoneId) {
        return valueOf(localDateTime.atZone(zoneId).toEpochSecond(), zoneId);
    }

    public static DateTimeUtils valueOf(Long seconds) {
        ZoneId zoneId = ZoneId.systemDefault();
        return new DateTimeUtils(seconds, zoneId);
    }

    public static DateTimeUtils valueOf(Long seconds, ZoneId zoneId) {
        return new DateTimeUtils(seconds, zoneId);
    }

    public String format() {
        return format(YYYY_MM_DD_HH_MM_SS);
    }

    public String format(String pattern) {
        return DateTimeFormatter.ofPattern(pattern).withZone(zoneId).format(Instant.ofEpochSecond(value));
    }

    public Long timestamp() {
        return value;
    }
}
