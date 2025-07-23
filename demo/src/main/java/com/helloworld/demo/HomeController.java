package com.helloworld.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // use this as a web controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "index.html";
    }
}
