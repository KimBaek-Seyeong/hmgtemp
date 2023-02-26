package com.hmgtemp.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String root() {
        return "index.html";
    }

//    @RequestMapping("/hello")
//    public List<String> helloTest() {
//        return Arrays.asList("SAY IT!", "HELLO WORLD!");
//    }

}
