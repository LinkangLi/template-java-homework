package org.oobootcamp.warmup;

public class ParkResult
{
    Ticket ticket = null;
    public ParkResult(Ticket ticket) {
        ticket = ticket;
    }

    public boolean HasTicket() {
        return ticket != null;
    }
}
