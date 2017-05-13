package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by yyi on 2017/5/13.
 */
@Controller
@RequestMapping("/hello")
public class WelcomeController {

    @Value("${welcome.message:test}")
    private  String message="hello world";

    @RequestMapping("/hi")
    public String welcome(Map<String,Object> map){
        map.put("message",message);
        return "welcome";
    }
}
