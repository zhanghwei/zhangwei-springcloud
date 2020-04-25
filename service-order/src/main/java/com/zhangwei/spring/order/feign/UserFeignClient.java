package com.zhangwei.spring.order.feign;

import com.zhangwei.springcloud.mode.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name="service-user")
public interface UserFeignClient {
    @RequestMapping("/user/getUserById")
    public User getUserById(@RequestParam("id") Integer id);

    @RequestMapping("/user/getUserByUser")
    public User getUserByUser(@RequestBody User user);

    @RequestMapping("/user/getUsernameById")
    public String getUsernameById(@RequestParam("id") Integer id);
}
