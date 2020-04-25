package com.zhangwei.spring.order.feign;

import com.zhangwei.springcloud.mode.User;
import org.springframework.stereotype.Component;

//@Component
public class UserFeign implements UserFeignClient {
    @Override
    public User getUserById(Integer id) {
        User u = new User();
        u.setUsername("固定值");
        return u;
    }

    @Override
    public User getUserByUser(User user) {
        User u = new User();
        u.setUsername("固定值");
        return u;
    }

    @Override
    public String getUsernameById(Integer id) {
        return null;
    }
}
