package com.webservice.springcxf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:/spring/applicationContext.xml")
public class SpringCxfApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCxfApplication.class, args);
    }

}

