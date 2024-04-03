package com.javalearning.example.aop.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javalearning.example.aop.interfaces.Vehicle;

@Component
public class Person {
  public Audi audi;
  public BMW bmw;

  // @Autowired
  // public Person(Audi audi, BMW bmw) {
  // this.audi = audi;
  // this.bmw = bmw;
  // System.out.println(audi.name + " " + bmw.name);
  // System.out.println(this.audi + "" + this.bmw);
  // }

  public void drive(Vehicle vehicle) {
    System.out.println("Person driving...");
    System.out.println(this.audi + "" + this.bmw);
    // vehicle.drive();
  }
}
