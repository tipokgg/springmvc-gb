package ru.geekbrains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

// this project can be dropped from Git after end of course "Spring LVL1". Only for sending homework

@EnableWebMvc
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}


//http://localhost:8080/first-application/hello
//http://localhost:8080/first-application/user
