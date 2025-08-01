package com.shangjie.springcoredemo.config;

import com.shangjie.springcoredemo.common.Coach;
import com.shangjie.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
