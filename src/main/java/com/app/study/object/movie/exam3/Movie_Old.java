package com.app.study.object.movie.exam3;

import java.time.Duration;
import java.util.List;

@Deprecated
public class Movie_Old {
  private String title;
  private Duration runningTime;
  private Money fee;
  private List<DiscountCondition> discountConditions;

  private MovieType movieType;
  private Money discountAmount;
  private double discountPercent;

  public Money calculateMovieFee(Screening screening) {
    if (isDiscountable(screening)) {
      return fee.minus(calculateDiscountAmount());
    }

    return fee;
  }

  private Money calculateDiscountAmount() {
    switch (movieType) {
      case AMOUNT_DISCOUNT:
        return calculateAmountDiscountAmount();
      case PERCENT_DISCOUNT:
        return calculatePercentDiscountAmount();
      case NONE_DISCOUNT:
        return calculateNoneDiscountAmount();
    }
    throw new IllegalArgumentException();
  }

  private Money calculateNoneDiscountAmount() {
    return Money.ZERO;
  }

  private Money calculatePercentDiscountAmount() {
    return fee.times(discountPercent);
  }

  private Money calculateAmountDiscountAmount() {
    return discountAmount;
  }

  private boolean isDiscountable(Screening screening) {
    return discountConditions.stream()
      .anyMatch(condition -> condition.isSatisfiedBy(screening));
  }
}
