package com.app.study.object.theater.exam2;

public class TicketSeller {
  private TicketOffice ticketOffice;

  public TicketSeller(TicketOffice ticketOffice) {
    this.ticketOffice = ticketOffice;
  }

  // ticketOffice 캡슐화. ticketOffice가 private 이고 접근 가능한 메서드가 존재하지 않기 때문.
//  public TicketOffice getTicketOffice() {
//    return ticketOffice;
//  }

  public void sellTo(Audience audience) {
//    if (audience.getBag().hasInvitation()) {
//      Ticket ticket = ticketOffice.getTicket();
//      audience.getBag().setTicket(ticket);
//    } else {
//      Ticket ticket = ticketOffice.getTicket();
//      audience.getBag().minusAmount(ticket.getFee());
//      ticketOffice.plusAmount(ticket.getFee());
//      audience.getBag().setTicket(ticket);
//    }

//    ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
    ticketOffice.sellTicketTo(audience);
  }
}
