package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {


    public static void main(String[] args) {
        var context = SpringApplication.run(Application.class, args);
        for(var i =0;i<10;i++) {
            var counter = context.getBean("getCounter", Counter.class);
            System.out.println(counter.getCount());
        }

    }

}
