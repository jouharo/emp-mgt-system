package com.spring.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.controllers.EmployeeManagementController;

/**
 * Created by Jo on 6/22/2017.
 */
@SpringBootApplication
//@ComponentScan(basePackages={"com.controllers", "com.domain","com.repository","com.service"})
//@EnableJpaRepositories("com.repository")
public class Application {
        public static void main(String []args){
                SpringApplication.run(Application.class, args);
        }
}
