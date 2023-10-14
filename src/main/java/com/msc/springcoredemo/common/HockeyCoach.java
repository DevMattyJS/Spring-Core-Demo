package com.msc.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component          // @Component annotation marks the class as a spring bean
public class HockeyCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice shootout for 30 minutes";
    }
}
