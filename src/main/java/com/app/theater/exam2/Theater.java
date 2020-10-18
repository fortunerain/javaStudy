package com.app.theater.exam2;

public class Theater {
  private TicketSeller ticketSeller;

  public Theater(TicketSeller ticketSeller) {
    this.ticketSeller = ticketSeller;
  }

  public void enter(Audience audience) {
//    ticketSeller.sellTo 로 이동시키자.

//    if (audience.getBag().hasInvitation()) {
//      Ticket ticket = ticketOffice.getTicket();
//      audience.getBag().setTicket(ticket);
//    } else {
//      Ticket ticket = ticketOffice.getTicket();
//      audience.getBag().minusAmount(ticket.getFee());
//      ticketOffice.plusAmount(ticket.getFee());
//      audience.getBag().setTicket(ticket);
//    }

    // ticketOffice 에 접근하지 않는다. Theater 는 ticketOffice 가 ticketSeller 내부에 존재한다는 사실을 모른다.
    ticketSeller.sellTo(audience);

  }
}
