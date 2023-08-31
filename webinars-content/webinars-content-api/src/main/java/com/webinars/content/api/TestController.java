package com.webinars.content.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname TestController
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/8/29 12:28
 * @Created by lzh
 */
@RestController
@RefreshScope
public class TestController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/config/info")
    public String getConfigInfo(){
        return port;
    }

}
