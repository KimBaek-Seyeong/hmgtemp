package com.hmgtemp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/api")
    public String landingPage() {
        return "index";
    }

//    @RequestMapping("/hello")
//    public List<String> helloTest() {
//        return Arrays.asList("SAY IT!", "HELLO WORLD!");
//    }

}
