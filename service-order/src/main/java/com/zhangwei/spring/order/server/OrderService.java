package com.zhangwei.spring.order.server;

import com.zhangwei.spring.order.model.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public Order getOrderById(Integer id) {
        Order order = new Order();
        order.setId(id);
        order.setOrderno(System.currentTimeMillis()+"");
        order.setUserId(1);
        return order;
    }


}
