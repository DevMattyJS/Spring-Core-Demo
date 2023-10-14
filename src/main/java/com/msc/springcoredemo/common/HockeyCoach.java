package com.msc.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice shootout for 30 minutes";
    }
}
