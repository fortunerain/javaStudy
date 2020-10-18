package com.app.movie.exam4;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class DiscountCondition {
  private DiscountConditionType type;
  private int sequence;
  private DayOfWeek dayOfWeek;
  private LocalTime startTime;
  private LocalTime endTime;

  public DiscountConditionType getType() {
    return type;
  }

  public void setType(DiscountConditionType type) {
    this.type = type;
  }

  public int getSequence() {
    return sequence;
  }

  public void setSequence(int sequence) {
    this.sequence = sequence;
  }

  public DayOfWeek getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(DayOfWeek dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  public LocalTime getStartTime() {
    return startTime;
  }

  public void setStartTime(LocalTime startTime) {
    this.startTime = startTime;
  }

  public LocalTime getEndTime() {
    return endTime;
  }

  public void setEndTime(LocalTime endTime) {
    this.endTime = endTime;
  }

  public boolean isDiscountable(DiscountCondition condition, Screening screening) {
    if (condition.getType() == DiscountConditionType.PERIOD) {
      return isSatisfiedByPeriod(condition, screening);
    }
    return isSatisfiedBySequence(condition, screening);
  }

  private boolean isSatisfiedBySequence(DiscountCondition condition, Screening screening) {
    return condition.getSequence() == screening.getSequence();
  }

  private boolean isSatisfiedByPeriod(DiscountCondition condition, Screening screening) {
    boolean discountable;
    discountable = screening.getWhenScreened().getDayOfWeek().equals(condition.getDayOfWeek()) &&
      condition.getStartTime().compareTo(screening.getWhenScreened().toLocalTime()) <= 0 &&
      condition.getEndTime().compareTo(screening.getWhenScreened().toLocalTime()) >= 0;
    return discountable;
  }
}
