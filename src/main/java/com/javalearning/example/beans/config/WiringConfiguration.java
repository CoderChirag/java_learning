package com.javalearning.example.beans.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.javalearning.example.beans.Person;
import com.javalearning.example.beans.Vehicle;

@Configuration
@ComponentScan("com.javalearning.example.beans.components")
public class WiringConfiguration {
  @Bean
  Vehicle vehicle() {
    Vehicle vehicle = new Vehicle();
    vehicle.setName("Audi Q8");
    return vehicle;
  }

  // Wiring Beans using Method Call - Only one Bean of Vehicle is created
  @Bean
  @Primary
  Person person() {
    Person person = new Person();
    person.setName("John Doe");
    person.setVehicle(vehicle());
    return person;
  }

  // Wiring Beans using Method Parameters
  @Bean
  Person person2(Vehicle vehicle) {
    Person person = new Person();
    person.setName("Jane Doe");
    person.setVehicle(vehicle);
    return person;
  }
}
