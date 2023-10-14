package com.msc.springcoredemo.rest;

import com.msc.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency
    private Coach coach;

    // 1.) Constructor injection - define a constructor for dependency injection
//    @Autowired
//    public DemoController(Coach coach) {
//        this.coach = coach;
//    }

    // 2.) Setter injection - define a setter method for dependency injection
    @Autowired
    public void setCoach(Coach theCoach) {
        coach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }


}
