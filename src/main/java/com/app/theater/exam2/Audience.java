package com.app.theater.exam2;

public class Audience {
  private Bag bag;

  public Audience(Bag bag) {
    this.bag = bag;
  }

//  public Bag getBag() {
//    return bag;
//  }

  // Bag 캡슐화. Audience 가 Bag 을 직접 처리. 외부에서는 Bag 을 소유하고 있다는 사실을 알 필요가 없다.
  public Long buy(Ticket ticket) {
//    if (bag.hasInvitation()) {
//      bag.setTicket(ticket);
//      return 0L;
//    } else {
//      bag.minusAmount(ticket.getFee());
//      bag.setTicket(ticket);
//      return ticket.getFee();
//    }
    return bag.hold(ticket);
  }
}
