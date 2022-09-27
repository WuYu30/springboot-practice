package wy.springboot01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 组合注解RestController = Controller + ResponsBody
 *
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(String name){
        System.out.println("hello run......" + name);
        return "hello" + name;
    }
}
