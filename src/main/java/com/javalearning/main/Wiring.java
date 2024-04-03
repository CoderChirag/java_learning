package com.javalearning.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.javalearning.example.beans.Person;
import com.javalearning.example.beans.components.RichPerson;
import com.javalearning.example.beans.config.WiringConfiguration;

public class Wiring {
  public static void main(String[] args) {
    System.out.println("-----------------------------Wiring.java-------------------------------");
    var context = new AnnotationConfigApplicationContext(WiringConfiguration.class);

    // Wiring Beans using Method Call
    var person = context.getBean(Person.class);
    System.out.println(person.getName() + " drives " + person.getVehicle().getName());

    // Wiring Beans using Method Parameters
    var person2 = context.getBean("person2", Person.class);
    System.out.println(person2.getName() + " drives " + person2.getVehicle().getName());

    // Wiring Beans using @Autowired
    var richPerson = context.getBean(RichPerson.class);
    System.out.println(richPerson.getName() + " drives " + richPerson.getVehicle().getName());

    context.close();
  }
}
