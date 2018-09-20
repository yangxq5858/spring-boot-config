package com.hx.springbootconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//这里是导入外部的xml配置文件
//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class SpringBootConfigApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootConfigApplication.class, args);
    }
}
