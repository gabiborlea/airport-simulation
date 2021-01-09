package model;

import java.util.ArrayList;
import java.util.Date;

public class Flight implements ObjectInterface{
    private final int ID;
    private final ArrayList<Integer> passengersIDS;
    private final String arrivalCity;
    private final Date boardingTime;
    private final Date arrivalTime;

    public Flight(int ID, String arrivalCity, Date boardingTime, Date arrivalTime) {
        passengersIDS = new ArrayList<>();
        this.ID = ID;
        this.arrivalCity = arrivalCity;
        this.boardingTime = boardingTime;
        this.arrivalTime = arrivalTime;
    }

    @Override
    public int getID() {
        return ID;
    }

    public void addPassenger(int passenger) {
        this.passengersIDS.add(passenger);
    }

    public ArrayList<Integer> getPassengers() {
        return passengersIDS;
    }


    public String getArrivalCity() {
        return arrivalCity;
    }

    public Date getBoardingTime() {
        return boardingTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public String toString() {
        return ID + "," + passengersIDS + "," + arrivalCity + "," + boardingTime + "," + arrivalTime;
    }
}
