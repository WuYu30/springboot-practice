package wy.springboot01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wy.springboot01.domain.User;

@RestController
public class UserController {
    @Autowired //从spring容器当中自动装载对象
    private User user;

    @RequestMapping("/showuser")
    public User showuser(){
        System.out.println("user is " + user);
        return user;
    }
}
