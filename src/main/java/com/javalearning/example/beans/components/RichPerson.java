package com.javalearning.example.beans.components;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RichPerson {
  private String name;
  @Autowired
  private Car car;

  @PostConstruct
  public void initialize() {
    this.setName("Component Bean: Rich Person");
  }

  public RichPerson() {
    System.out.println("Rich Person instance created.");
  }

  public String getName() {
    return name;
  }

  public Car getVehicle() {
    return car;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setVehicle(Car car) {
    this.car = car;
  }
}
