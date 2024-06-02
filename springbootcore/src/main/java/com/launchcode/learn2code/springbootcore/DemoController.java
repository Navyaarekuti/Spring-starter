package com.launchcode.learn2code.springbootcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;

    @Autowired

    public DemoController(Coach myCoach) {
        this.myCoach = myCoach;
    }
    @GetMapping("/dailytask")
    public String getDailyWorkOut()
    {
        return myCoach.getDailyWorkOut();
    }
}
//    public DemoController(Coach thecoach) {
//        mycoach = thecoach;
//    }

