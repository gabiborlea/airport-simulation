package model;

public class Ticket implements ObjectInterface{
    public final int ticketID;
    public final int flightID;
    public final int checkInPointID;

    public Ticket(int ticketID, int flightID, int checkInPointID) {
        this.ticketID = ticketID;
        this.flightID = flightID;
        this.checkInPointID = checkInPointID;
    }

    @Override
    public int getID() {
        return 0;
    }

    public int getFlightID() {
        return flightID;
    }

    public int getCheckInPointID() {
        return checkInPointID;
    }
}
