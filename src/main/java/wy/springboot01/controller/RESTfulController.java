package wy.springboot01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wy.springboot01.domain.User;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class RESTfulController {
    @PostMapping("/user")
    public User insertUser(User user){
        System.out.println("user add......");
        return user;
    }
    @GetMapping("/user")
    public ArrayList<User> getUser(){
        System.out.println("user get......");
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1001,"wu","1212",new ArrayList<>(Arrays.asList("nanchang", "sichuan", "beijing"))));
        users.add(new User(1002,"du","1313",new ArrayList<>(Arrays.asList("chang", "sica", "beng"))));
        return users;
    }

    @DeleteMapping("/user/{uid}")
    public User deleteUser(@PathVariable Integer uid){
        System.out.println(uid + " user delete");
        return new User(uid,"wuwu","1212",new ArrayList<>(Arrays.asList("nanchang", "sichuan", "beijing")));
    }

}
