package com.zhangwei.spring.order.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Order {

    private Integer id;
    private String orderno;
    private Integer userId;
    private String username;

}
