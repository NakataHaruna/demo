package com.example.sample.controllers;

@Controller   
public class SampleController {    
 
    @ResponseBody
    @GetMapping("/")    
    public String index() {    
        return "初めての Spring Boot";    
    }    
}