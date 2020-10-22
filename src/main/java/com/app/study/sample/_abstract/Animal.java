package com.app.study.sample._abstract;

public abstract class Animal {

  // 추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재 할 수 있다.
  // public 이기 때문에 자식 클래스에서 오버라이딩이 가능.
  public void behavior() {
    run();
    animalSound();
    stop();
  }

  // abstract 키워드로 인해 자식 클래스에서 아래 메소드를 구현하도록 강제한다.
  protected abstract void animalSound();

  // 본체가 있는 메소드는 abstract 키워드를 가질 수 없다.
  // protected 이기 때문에 자식클래스, 같은 패키지 내에서 명시적으로 오버라이딩은 가능하다.
  protected void run() {
    System.out.println("달린다.");
  }

  protected void stop() {
    System.out.println("정지한다.");
  }


}
