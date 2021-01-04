package model;

public class Luggage implements ObjectInterface{
    private int idTag;
    private int weight;

    @Override
    public int getID() {
        return idTag;
    }
}
