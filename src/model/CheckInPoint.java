package model;

import java.util.ArrayList;
import java.util.Date;

public class CheckInPoint implements ObjectInterface{
    private final int ID;
    private final int flightID;
    private final Date startInterval;
    private final Date endInterval;

    public CheckInPoint(int ID, int flightID, Date startInterval, Date endInterval) {
        this.ID = ID;
        this.flightID = flightID;
        this.startInterval = startInterval;
        this.endInterval = endInterval;
    }

    @Override
    public int getID(){
        return ID;
    }

    public int getFlightID(){
        return flightID;
    }

    public Date getStartInterval() {
        return startInterval;
    }

    public Date getEndInterval() {
        return endInterval;
    }

    @Override
    public String toString() {
        return ID + "," + flightID + "," + startInterval + "," + endInterval;
    }

}
