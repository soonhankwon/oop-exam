package com.soon.oopexam.service;

import com.soon.oopexam.domain.Timer;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class TimerService {
    public long getTime() {
        Timer t = new Timer();
        t.start();
        t.stop();
        return t.elapsedTime(TimeUnit.MILLISECONDS);
    }
}
