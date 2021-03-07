package com.atguigu.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class OrderZkController {

    @Resource
    private RestTemplate template;

    String url = "http://cloud-payment-service";

    @GetMapping(value = "/consumer/payment/zk")
    public String paymentZk() {
        String result = template.getForObject(url + "/payment/zk",String.class);
        return result;
    }

}
