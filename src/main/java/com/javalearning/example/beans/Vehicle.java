package com.javalearning.example.beans;

public class Vehicle {
  private String name;

  public Vehicle() {
    System.out.println("Vehicle instance created.");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
