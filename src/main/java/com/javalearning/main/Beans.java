package com.javalearning.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.javalearning.example.beans.Vehicle;
import com.javalearning.example.beans.components.Car;
import com.javalearning.example.beans.config.BeansConfiguration;

public class Beans {
  public static void main(String[] args) {
    System.out.println("---------------------------Beans.java---------------------------------");
    var veh = new Vehicle();
    veh.setName("Honda City");
    System.out.println("Vehicle name from non-Spring context(bean) is: " + veh.getName());

    var context = new AnnotationConfigApplicationContext(BeansConfiguration.class);

    // Primary annotation is used to specify the primary bean to be used when
    // multiple beans of the same type are present.
    Vehicle vehicle = context.getBean(Vehicle.class);
    System.out.println("Vehicle name from Spring context(bean) is: " + vehicle.getName());

    // Vehicle 2 is not marked as primary, so we need to specify the bean name to
    // get the bean.
    var vehicle2 = context.getBean("vehicle2", Vehicle.class);
    System.out.println("Vehicle 2 name from Spring context(bean) is: " + vehicle2.getName());

    // Car is marked as a component, so we can get the bean without specifying the
    // bean name.
    var car = context.getBean(Car.class);
    System.out.println("Car name from Spring context(bean) is: " + car.getName());

    // We can also specify string and integer beans.
    var hello = context.getBean(String.class);
    System.out.println("String bean from Spring context is: " + hello);

    // We can also specify string and integer beans.
    var number = context.getBean(Integer.class);
    System.out.println("Integer bean from Spring context is: " + number);

    // Dynamic bean registration.
    context.registerBean("vehicle3", Vehicle.class, () -> {
      Vehicle vehicle3 = new Vehicle();
      vehicle3.setName("Dynamic Bean: Vehicle 3");
      return vehicle3;
    });
    var vehicle3 = context.getBean("vehicle3", Vehicle.class);
    System.out.println("Vehicle 3 name from Spring context(bean) is: " + vehicle3.getName());

    context.close();
  }
}
