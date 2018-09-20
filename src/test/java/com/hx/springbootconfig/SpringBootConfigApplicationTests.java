package com.hx.springbootconfig;

import com.hx.springbootconfig.bean.Person;
import com.hx.springbootconfig.bean.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootConfigApplicationTests {


    @Autowired
    private Student student;

    @Autowired
    private ApplicationContext Ioc;

    @Test
    public void contextLoads() {
        Object person = Ioc.getBean("person");
//        Object student = Ioc.getBean("student");

        System.out.println(person);
//        System.out.println(student);
        System.out.println(student);
//        System.out.println(person);
    }

}
