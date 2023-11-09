package com.litemall.order;

import com.litemall.clients.ProductClient;
import com.litemall.param.ProductCollectParam;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * projectName: b2c-store
 * <p>
 * description: 订单的启动类
 */
@MapperScan(basePackages = "com.litemall.order.mapper")
@SpringBootApplication
@EnableFeignClients(clients = {ProductClient.class})
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class,args);
    }
}
