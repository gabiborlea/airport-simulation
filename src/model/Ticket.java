package model;

public class Ticket implements ObjectInterface{
    public int ticketID;
    public int flightID;
    public int checkInID;

    @Override
    public int getID() {
        return 0;
    }
}
