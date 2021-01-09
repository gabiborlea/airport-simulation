package controller;

import model.CheckInPoint;
import model.Passenger;
import repository.CheckInPointRepository;
import repository.FlightRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Controller {
    FlightRepository flightRepository;
    CheckInPointRepository checkInPointRepository;
    private Connection connection;
    private Statement statement;

    public Controller(){
        try {
            String url = "jdbc:sqlserver://localhost\\MSSQLSERVER:1433;database=AirportSimulation";
            String user = "root";
            String password = "qwerty123";
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
        }catch (SQLException exception) {
            exception.printStackTrace();
        } finally {
            assert statement != null;
            flightRepository = new FlightRepository(statement);
            checkInPointRepository = new CheckInPointRepository(statement);
        }
    }
    public void test() {
        System.out.println(flightRepository.getFlights());
        System.out.println(checkInPointRepository.getCheckInPoints());
    }

    public ArrayList<CheckInPoint> getCheckInPoints() {
        return checkInPointRepository.getCheckInPoints();
    }

    public boolean verificication(Passenger passenger){
        return true;
    }
}
