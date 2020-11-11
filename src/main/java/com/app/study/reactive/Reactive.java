package com.app.study.reactive;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Reactive {

  static class IntObservable extends Observable implements Runnable {

    @Override
    public void run() {
      // publisher
      for (int i = 1; i <= 10; i++) {
        setChanged();
        notifyObservers(i);   // 데이터를 넘겨줌. push. i 값을 메소드 인자로 넘김. void 임.
        // int i = iter.next()  // pull. i 값은 next 리턴한 값.
      }
    }
  }

  public static void main(String[] args) {

    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

    // pull 방식
    Iterable<Integer> iter = Arrays.asList(1, 2, 3, 4, 5);

//    for (Integer i : iter) {
//      System.out.println(i);
//    }

    Iterable<Integer> iter2 = () ->
      new Iterator<Integer>() {
        final static int MAX = 10;
        int i = 0;

        @Override
        public boolean hasNext() {
          return i < MAX;
        }

        @Override
        public Integer next() {
          return ++i;
        }
      };

    for (Iterator<Integer> it = iter2.iterator(); it.hasNext(); ) {
      System.out.println(it.next());
    }



    // Observable
    // subscriber
    Observer ob = new Observer() {
      @Override
      public void update(Observable o, Object arg) {
        System.out.println(Thread.currentThread().getName() + " " + arg);
      }
    };

    IntObservable io = new IntObservable();
    // observer가 notify된 데이터를 던진거를 등록
    io.addObserver(ob);
    io.run();

    ExecutorService es = Executors.newSingleThreadExecutor();
    es.execute(io);

    System.out.println(Thread.currentThread().getName() + " EXIT");
    es.shutdown();



  }


}
