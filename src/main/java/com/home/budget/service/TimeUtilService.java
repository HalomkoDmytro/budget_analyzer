package com.home.budget.service;

public class TimeUtilService {

    public static final Long MINUTE = 60 * 1000L;
    public static final Long HOUR = 60 * 60 * 1000L;
    public static final Long DAY = 24 * 60 * 60 * 1000L;

    public static Long getDayBefore(Long timeMillis) {
        return timeMillis - DAY;
    }

}
