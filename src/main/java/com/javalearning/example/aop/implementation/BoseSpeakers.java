package com.javalearning.example.aop.implementation;

import com.javalearning.example.aop.interfaces.Speakers;
import com.javalearning.example.aop.model.Song;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {

  public String makeSound(Song song) {
    return "Playing the song " + song.getTitle() + " by "
        + song.getSingerName() +
        " with Bose speakers";
  }

}