package com.javalearning.example.aop.beans;

import org.springframework.stereotype.Component;

import com.javalearning.example.aop.interfaces.Vehicle;

@Component
public class BMW implements Vehicle {
  public String name = "BMW";

  public void drive() {
    System.out.println("BMW driving...");
  }
}
