package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondClass {
    @RequestMapping("/home")
    public String function1(){
        return "Welcome user";
    }

    @RequestMapping("/user")
    public String function2(){
        return String.format("User: %s\nAge: %s\nFrom: %s\n", "Zhelyazko", "18", "Burgas");
    }

    @RequestMapping("/about")
    public String function3(){
        return "I like Red bull";
    }

    @RequestMapping("/contact")
    public String function4(){
        return "Contact: 123456789";
    }
}
