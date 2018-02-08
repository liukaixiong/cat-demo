package com.elab.cat.catdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.elab.cat.catdemo"})
public class CatDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CatDemoApplication.class, args);
    }
}
