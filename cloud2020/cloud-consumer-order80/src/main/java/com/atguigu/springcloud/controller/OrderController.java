package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entity.CommonResult;
import com.atguigu.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {

    @Resource
    private RestTemplate restTemplate;

    String url = "http://127.0.0.1:8001/";

    @PostMapping(value = "/consumer/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        CommonResult result = restTemplate.postForObject(url+"payment/create/",payment, CommonResult.class);
        return  result;
    }

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){


        CommonResult result = restTemplate.getForObject(url+"payment/get/"+id,CommonResult.class);
        return result;

    }
}
