package com.zhangwei.springcloud;

import com.zhangwei.springcloud.config.ConsulConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RefreshScope动态刷新配置
@RefreshScope
@RestController
public class TestController {
    @Value("${config.info}")
    private String configInfo;

    @Autowired
    private ConsulConfig consulConfig;

    @RequestMapping("getConfig")
    public Object getConfig(){
        return consulConfig;
    }
}
