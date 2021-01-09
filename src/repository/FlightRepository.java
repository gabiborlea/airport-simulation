package repository;

import model.Flight;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

public class FlightRepository {
    private Statement statement;
    private ArrayList<Flight> flights;

    public FlightRepository(Statement statement){
        flights = new ArrayList<>();
        this.statement = statement;
        try {
            var result = statement.executeQuery("select * from Flights");
            while (result.next()) {
                int ID = result.getInt("ID");
                String arrivalCity = result.getString("arrivalCity");
                Time boardingTime = result.getTime("boardingTime");
                Time arrivalTime = result.getTime("arivalTime");
                var flight = new Flight(ID, arrivalCity, boardingTime, arrivalTime);
                flights.add(flight);

            }
            setPassengersIDS();

        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public Flight getFlightById(int ID){
        for (var flight: flights){
            if (flight.getID() == ID)
                return flight;
        }
        return null;
    }

    public void setPassengersIDS() {
        try {
            var result = statement.executeQuery("select * from FlightsPassengers");
            while (result.next()) {
                int flightID = result.getInt("flightID");
                int passengerID = result.getInt("passengerID");
                var flight = getFlightById(flightID);
                flight.addPassenger(passengerID);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public ArrayList<Flight> getFlights() {
        return flights;
    }
}
