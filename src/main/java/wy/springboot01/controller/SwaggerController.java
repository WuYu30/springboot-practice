package wy.springboot01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
public class SwaggerController {

    @PostMapping("/post")
    public String get(){
        return "post";
    }

    @GetMapping("/get")
    public String get(String a, String b){
        return "get";
    }

    @RequestMapping("/req")
    public String req(String m){
        return "req";
    }
}
