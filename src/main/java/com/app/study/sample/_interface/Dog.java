package com.app.study.sample._interface;

public class Dog implements Soundable, Runnable {

  @Override
  public void sound() {
    System.out.println("멍멍!");
  }

  @Override
  public void run() {
    System.out.println("달린다.");
  }

  @Override
  public void stop() {
    System.out.println("멈춘다.");
  }
}
