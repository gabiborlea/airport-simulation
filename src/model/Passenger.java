package model;

public class Passenger implements ObjectInterface{
    private final int ID;
    private final int ticketID;
    private final int luggageChecked;

    public Passenger(int id, int ticketID, int luggageChecked) {
        ID = id;
        this.ticketID = ticketID;
        this.luggageChecked = luggageChecked;
    }

    @Override
    public int getID(){
        return ID;
    }

    public int getTicketID() {
        return ticketID;
    }

    public int getLuggageChecked() {
        return luggageChecked;
    }
}
