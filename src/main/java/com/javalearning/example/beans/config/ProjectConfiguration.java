package com.javalearning.example.beans.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.javalearning.example.beans.Vehicle;

@Configuration
@ComponentScan("com.javalearning.example.beans")
public class ProjectConfiguration {
  @Bean
  @Primary
  Vehicle vehicle() {
    Vehicle vehicle = new Vehicle();
    vehicle.setName("Primary: Audi Q8");
    return vehicle;
  }

  @Bean
  Vehicle vehicle2() {
    Vehicle vehicle = new Vehicle();
    vehicle.setName("Vehicle 2");
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
