package com.msc.springcoredemo.common;

// we will not use @Component annotation here on purpose, we will use alternative solution with this one
public class SwimCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Swim a 1000 meters as a warm up";
    }
}
