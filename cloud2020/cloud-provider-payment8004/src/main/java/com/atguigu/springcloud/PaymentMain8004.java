package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // 该注解用于向实用consul或者zookeeper作为注册中心注册服务
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class, args);
    }
}
/**
 * zk查询命令
 * ls /
 * ls /services
 * ls /services/cloud-payment-service
 * ls /services/cloud-payment-service/921703f7-442d-4802-82ad-8503fbde5f1a
 * get /services/cloud-payment-service/921703f7-442d-4802-82ad-8503fbde5f1a
 */