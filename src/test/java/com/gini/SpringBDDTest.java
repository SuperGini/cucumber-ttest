package com.gini;


import io.cucumber.spring.CucumberContextConfiguration;

import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = Test1Application.class)
public class SpringBDDTest {


    public void test(){
        System.out.println("*******************************************************");
    }

}
