package com.rest.api.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class HelloController {

    @GetMapping(value = "/helloworld/string")
    @ResponseBody
    public String helloworldString() {
        return "helloworld";
    }

    @GetMapping(value = "/helloworld/json")
    @ResponseBody
    public Hello helloworldJson(){
        Hello hello = new Hello();
        hello.message = "helloworld";
        return hello;
    }

    @GetMapping(value = "/helloworld/page")
    public String helloworld(){
        return "helloworld";
    }

    @GetMapping("/welcome")
    public String hello(Map model){
        model.put("message", "hello freemarker!");
        return "hello";
    }

    @Setter
    @Getter
    public static class Hello{
        private String message;
    }
}
