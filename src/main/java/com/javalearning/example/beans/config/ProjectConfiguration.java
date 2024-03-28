package com.javalearning.example.beans.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.javalearning.example.beans.Vehicle;

@Configuration
public class ProjectConfiguration {
  @Bean
  Vehicle vehicle() {
    Vehicle vehicle = new Vehicle();
    vehicle.setName("Audi Q8");
    return vehicle;
  }

  @Bean
  String hello() {
    return "Hello, World!";
  }

  @Bean
  Integer number() {
    return 100;
  }
}
