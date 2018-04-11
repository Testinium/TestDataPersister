package com.testinium.testdatapersister.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author erdoganonur on 11.04.2018
 */


@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.testinium.*"})
@EnableMongoRepositories(basePackages = {"com.testinium.*"})
public class TestDataPersisterApiApp {

    public static void main(String[] args) {
        SpringApplication.run(TestDataPersisterApiApp.class, args);
    }
}

