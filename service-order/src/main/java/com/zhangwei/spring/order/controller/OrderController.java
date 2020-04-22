package com.zhangwei.spring.order.controller;

import com.zhangwei.spring.order.feign.UserFeignClient;
import com.zhangwei.spring.order.model.Order;
import com.zhangwei.spring.order.server.OrderService;
import com.zhangwei.springcloud.mode.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@Slf4j
@RestController
@RequestMapping("/order/")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserFeignClient userFeignClient;

    @RequestMapping("getOrderById")
    public Order get(@RequestParam("id") Integer id){
        Order order=orderService.getOrderById(id);
        //User user = restTemplate.getForObject("http://service-user/user/getUserById?id="+order.getUserId(), User.class);
        User user = userFeignClient.getUserById(id);
       /* User userParam = new User();
        userParam.setId(1);
        User user = userFeignClient.getUserByUser(userParam);*/
        log.info("user{}:",user);
        order.setUsername(user.getUsername());
        return order;
    }
}
