package model;

import java.util.ArrayList;

public class Flight implements ObjectInterface{
    private ArrayList<Passenger> passengers;
    private int flightID;
    private String flightName;

    public Flight(int flightID, String flightName) {
        this.flightID = flightID;
        this.flightName = flightName;
    }

    public boolean checkPassenger(Passenger passenger){
        for (var p: passengers)
            if (passenger.getID() == passenger.getID())
                return true;

        return false;
    }
    public int getID() {
        return flightID;
    }
}
