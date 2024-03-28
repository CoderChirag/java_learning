package com.javalearning.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.javalearning.example.beans.Vehicle;
import com.javalearning.example.beans.config.ProjectConfiguration;

public class Beans {
  public static void main(String[] args) {
    var veh = new Vehicle();
    veh.setName("Honda City");
    System.out.println("Vehicle name from non-Spring context(bean) is: " + veh.getName());

    var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

    var vehicle = context.getBean(Vehicle.class);
    System.out.println("Vehicle name from Spring context(bean) is: " + vehicle.getName());

    var hello = context.getBean(String.class);
    System.out.println("String bean from Spring context is: " + hello);

    var number = context.getBean(Integer.class);
    System.out.println("Integer bean from Spring context is: " + number);

    context.close();
  }
}
