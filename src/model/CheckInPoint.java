package model;

import java.util.ArrayList;
import java.util.Date;

public class CheckInPoint implements ObjectInterface{
    private ArrayList<Date> timeInterval;
    private int checkInID;
    private int flightID;

    @Override
    public int getID(){
        return checkInID;
    }

    public int getFlightID(){
        return flightID;
    }

}
