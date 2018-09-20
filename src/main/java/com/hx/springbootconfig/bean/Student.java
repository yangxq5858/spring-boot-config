package com.hx.springbootconfig.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author yangxinqiang
 * @content
 * 测试指定资源文件属性绑定
 *
 *
 * @create 2018-09-20 16:18
 */
@Component
@PropertySource(value = "classpath:student.yml") //指定资源文件用 yml格式的读取不到值
@ConfigurationProperties(prefix = "student")
public class Student {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
