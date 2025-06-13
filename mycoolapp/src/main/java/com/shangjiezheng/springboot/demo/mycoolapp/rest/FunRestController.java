package com.shangjiezheng.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // inject properties for coach.name and team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // expose new endpoint for "teamInfo".

    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach: " + coachName + ", Team Name: " + teamName;
    }

    // Expose "/" endpoint that returns "Hello World".
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    // Expose new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    // Expose a new endpoint for "fortune"
    @GetMapping("/fortune")
    public String getFortune() {
        return "Today is your lucky day!";
    }


}
