package org.zgx.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Common启动类
 *
 * @author zgx
 * @date 2021/03/26
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CommonApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommonApplication.class, args);
    }
}
