package com.javalearning.example.beans;

public class Person {
  private String name;
  private Vehicle vehicle;

  public Person() {
    System.out.println("Person instance created.");
  }

  public String getName() {
    return name;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }
}
