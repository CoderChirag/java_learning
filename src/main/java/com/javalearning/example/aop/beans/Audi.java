package com.javalearning.example.aop.beans;

import org.springframework.stereotype.Component;

import com.javalearning.example.aop.interfaces.Vehicle;

@Component
public class Audi implements Vehicle {
  public String name = "Audi";

  public void drive() {
    System.out.println("Audi driving...");
  }
}
