package com.zhangwei.springcloud.user.service;

import com.zhangwei.springcloud.mode.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String getUsernameById(Integer id) {
        User user = getUserById(id);
        return  user.getUsername();
    }

    public User getUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUsername("userName"+id);
        return user;
    }
}
