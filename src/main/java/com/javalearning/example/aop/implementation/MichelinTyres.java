package com.javalearning.example.aop.implementation;

import com.javalearning.example.aop.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyres implements Tyres {

  @Override
  public String rotate() {
    return "Vehicle moving with the help of Michelin tyres";
  }

  @Override
  public String stop() {
    return "Vehicle stopped with the help of Michelin tyres";
  }

}