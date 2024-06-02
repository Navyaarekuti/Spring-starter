package com.launchcode.learn2code.springbootcore;

import org.springframework.stereotype.Component;

@Component
public class CrickectCoach implements Coach{

    @Override
    public String getDailyWorkOut() {
        return "Practice fastbowling for 15 min";
    }
}
