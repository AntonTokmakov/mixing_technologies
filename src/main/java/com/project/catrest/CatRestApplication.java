package com.project.catrest;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CatRestApplication {

    public static void main(String[] args) {

        Dotenv dotenv = Dotenv.load();

        SpringApplication.run(CatRestApplication.class, args);
    }

}
