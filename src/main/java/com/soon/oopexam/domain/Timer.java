package com.soon.oopexam.domain;

public class Timer {
    public long startTime;
    public long stopTime;

    public long calculateTime() {
        startTime = System.currentTimeMillis();
        stopTime = System.currentTimeMillis();
        return stopTime - startTime;
    }
}