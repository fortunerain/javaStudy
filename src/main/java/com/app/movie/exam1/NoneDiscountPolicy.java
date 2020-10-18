package com.app.movie.exam1;

public class NoneDiscountPolicy implements DiscountPolicy {
  @Override
  public Money calculateDiscountAmount(Screening screening) {
    return Money.ZERO;
  }
}
