package repository;

import model.CheckInPoint;

import java.sql.*;
import java.util.ArrayList;

public class CheckInPointRepository {
    private Statement statement;
    private ArrayList<CheckInPoint> checkInPoints;

    public CheckInPointRepository(Statement statement){
        checkInPoints = new ArrayList<>();
        this.statement = statement;
        try {
            var result = statement.executeQuery("select * from CheckInPoints");
            while (result.next()) {
                int ID = result.getInt("ID");
                int flightID = result.getInt("flightID");
                Time startInterval = result.getTime("startInterval");
                Time endInterval = result.getTime("endInterval");
                var checkinPoint = new CheckInPoint(ID, flightID, startInterval, endInterval);
                checkInPoints.add(checkinPoint);
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public ArrayList<CheckInPoint> getCheckInPoints() {
        return checkInPoints;
    }
}
