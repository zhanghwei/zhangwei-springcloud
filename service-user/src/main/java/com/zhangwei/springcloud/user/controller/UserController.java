package com.zhangwei.springcloud.user.controller;

import com.zhangwei.springcloud.mode.User;
import com.zhangwei.springcloud.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping("/user/")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("getUserByUser")
    public User getByUser(@RequestBody User user)
    {
        log.info("userId:{}",user.getId());
        return userService.getUserById(user.getId());
    }

    @RequestMapping("getUserById")
    public User getUserById(@RequestParam("id") Integer id)
    {
        log.info("userId:{}",id);
        return userService.getUserById(id);
    }

    @RequestMapping("getUsernameById")
    public String getUsernameById(@RequestParam("id")Integer id){
        return userService.getUsernameById(id);
    }
}
