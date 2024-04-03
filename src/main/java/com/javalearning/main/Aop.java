package com.javalearning.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.javalearning.example.aop.config.ProjectConfig;
import com.javalearning.example.aop.model.Song;
import com.javalearning.example.aop.services.VehicleServices;

public class Aop {
  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    var vehicleServices = context.getBean(VehicleServices.class);
    System.out.println(vehicleServices.getClass());
    Song song = new Song();
    song.setTitle("Blank Space");
    song.setSingerName("Taylor Swift");
    boolean vehicleStarted = true;
    vehicleServices.moveVehicle(vehicleStarted);
    vehicleServices.playMusic(vehicleStarted, song);
    vehicleServices.applyBrake(vehicleStarted);
    context.close();
  }
}
