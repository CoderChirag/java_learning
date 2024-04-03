package com.javalearning.example.beans.components;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Car {
  private String name;

  public Car() {
    System.out.println("Car instance created.");
  }

  @PostConstruct
  public void initialize() {
    this.setName("Component Bean: BMW X5");
  }

  @PreDestroy
  public void destroyObject() {
    System.out.println("Destroying Car bean");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
