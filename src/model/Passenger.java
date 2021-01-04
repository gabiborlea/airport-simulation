package model;

public class Passenger implements ObjectInterface{
    private int flightID;
    private int identityCard;
    private boolean luggageChecked;
    private boolean luggageWeight;
    private int checkInID;
    private int luggageID;

    @Override
    public int getID(){
        return identityCard;
    }

    public int getCheckInID() {
        return checkInID;
    }

    public boolean getLuggageChecked() {
        return luggageChecked;
    }
    public int getFlightID(){
        return flightID;
    }
}
