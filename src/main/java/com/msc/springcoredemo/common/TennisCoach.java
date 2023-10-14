package com.msc.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)         // set a scope of this bean to prototype
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Train your backhand volley for an hour";
    }
}
