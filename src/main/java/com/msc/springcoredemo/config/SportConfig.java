package com.msc.springcoredemo.config;

import com.msc.springcoredemo.common.Coach;
import com.msc.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Configuration class
@Configuration
public class SportConfig {

    // Sometimes we are not able to mark our dependencies as @Component (e.g. when working with 3rd party libraries)
    // In this case, we can configure that third-party existing class as a Spring bean using @Bean annotation inside a @Configuration class
    // Now we can use this class as dependency and inject it to our controller
    // Default beanId is the name of this class, but we can setup a custom one if we want in a bean annotation: @Bean(String beanId)
    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
