package com.soon.oopexam.service;

import com.soon.oopexam.domain.Timer;
import org.springframework.stereotype.Service;

@Service
public class TimerService {
    public long getTime() {
        Timer t = new Timer();
        return t.calculateTime();
    }
}
