package com.app.study.object.movie.exam3;

import java.time.DayOfWeek;
import java.time.LocalTime;

@Deprecated
public class DiscountCondition_Old {
  private DiscountConditionType type;
  private int sequence;
  private DayOfWeek dayOfWeek;
  private LocalTime startTime;
  private LocalTime endTime;

  public boolean isSatisfiedBy(Screening screening) {
    if (type == DiscountConditionType.PERIOD) {
      return isSatisfiedByPeriod(screening);
    }
    return isSatisfiedByPeriod(screening);
  }

  private boolean isSatisfiedByPeriod(Screening screening) {
    return this.dayOfWeek.equals(screening.getWhenScreened().getDayOfWeek()) &&
      this.startTime.compareTo(screening.getWhenScreened().toLocalTime()) <= 0 &&
      this.endTime.compareTo(screening.getWhenScreened().toLocalTime()) >= 0;
  }

  private boolean isSatisfiedBySequence(Screening screening) {
    return sequence == screening.getSequence();
  }
}
