package com.msc.springcoredemo.rest;

import com.msc.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency
    private Coach coach;
    private Coach anotherCoach;

    // 1.) Constructor injection - define a constructor for dependency injection
    // Since we have more than one matching beans, we have to specify which bean should be injected as a dependency
    // we use for that @Qualifier(beanId( annotation - beanId is the same as its className, but with lower first letter
    @Autowired
    public DemoController(
            @Qualifier("swimCoach") Coach coach,
            @Qualifier("tennisCoach") Coach anotherCoach) {
        this.coach = coach;
        this.anotherCoach = anotherCoach;
    }

    // 2.) Setter injection - define a setter method for dependency injection
//    @Autowired
//    public void setCoach(Coach theCoach) {
//        coach = theCoach;
//    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }

    // Check if coach and anotherCoach refers to same bean (instance of tennisCoach object)
    @GetMapping("/check")
    public String check() {
        return "Comparing constructors: coach == anotherCoach, " + (coach == anotherCoach);
    }


}
