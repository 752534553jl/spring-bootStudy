package com.springboot.study.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * SpringBootApplication组合注解
 * 由以下3个注解组合而成
 * @SpringBootConfiguration 配置类，在在这个类中配置bean，可以相当于spring中的applictionCentext.xml文件
 * @EnableAutoConfiguration 表示开启自动配置，springboot中的自动配置是非侵入式
 * @ComponentScan 完成包扫描，默认扫描的当前类所在包下的所有类
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
