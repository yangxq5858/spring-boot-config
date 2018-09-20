package com.hx.springbootconfig.config;

import com.hx.springbootconfig.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yxqiang
 * @create 2018-09-20 21:29
 */
//指明当前类是用于配置,相当于beans.xml文件
@Configuration
public class MyConfig {

    //@Bean 相当于在beans中声名的一个bean，将方法的返回值加入到容器中，id = 方法名
    @Bean
    public HelloService helloService(){
        System.out.println("将HelloService的实例加入到Spring 容器中");
        return new HelloService();
    }

}
