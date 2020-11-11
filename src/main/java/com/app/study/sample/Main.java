package com.app.study.sample;

import com.app.study.sample._abstract.Animal;
import com.app.study.sample._abstract.Cat;
import com.app.study.sample._abstract.Dog;

public class Main {
  public static void main(String[] args) {

    Animal dog = new Dog();
    dog.behavior();
    Animal cat = new Cat();
    cat.behavior();

    com.app.study.sample._interface.Cat cat1 = new com.app.study.sample._interface.Cat();
    cat1.sound();




  }
}
