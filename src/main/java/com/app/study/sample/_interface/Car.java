package com.app.study.sample._interface;

public class Car implements Soundable, Runnable {

  @Override
  public void sound() {
    System.out.println("빵빵");
  }
  
  @Override
  public void run() {
    System.out.println("자동차 달린다.");
  }

  @Override
  public void stop() {
    System.out.println("자동차 멈춘다.");
  }

}
