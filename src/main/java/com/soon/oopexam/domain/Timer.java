package com.soon.oopexam.domain;

import java.util.concurrent.TimeUnit;

public class Timer {
    private long startTime;
    private long stopTime;

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.stopTime = System.currentTimeMillis();
    }

    public long elapsedTime(TimeUnit unit) {
        if (unit == TimeUnit.MILLISECONDS) {
            return this.stopTime - this.startTime;
        }
        return 0;
    }
}