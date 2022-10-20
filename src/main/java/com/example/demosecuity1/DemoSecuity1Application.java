package com.example.demosecuity1;

import com.example.demosecuity1.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class DemoSecuity1Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoSecuity1Application.class, args);
        System.out.println("hola..............");
    }

}
