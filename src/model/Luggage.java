package model;

public class Luggage implements ObjectInterface{
    private final int ID;
    private final int weight;
    private final int passengerID;

    public Luggage(int id, int weight, int passengerID) {
        ID = id;
        this.weight = weight;
        this.passengerID = passengerID;
    }

    @Override
    public int getID() {
        return ID;
    }

    private int getWeight() {
        return weight;
    }

    private int getPassengerID() {
        return passengerID;
    }
}
