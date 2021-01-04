package controller;

import model.CheckInPoint;
import model.Flight;
import model.Passenger;
import repository.Repository;
import repository.RepositoryInterface;

import java.util.stream.Collectors;

public class Controller {
    RepositoryInterface checkInPointRepository;
    RepositoryInterface flightRepository;
    RepositoryInterface passengerRepository;
    RepositoryInterface luggageRepository;

    public Controller(){
        checkInPointRepository = new Repository();
        flightRepository = new Repository();
        passengerRepository = new Repository();
    }

    public boolean verificication(Passenger passenger){
        var checkInID = passenger.getCheckInID();

        CheckInPoint checkInPoint = (CheckInPoint) checkInPointRepository.getByID(checkInID);

        if(checkInPoint.getFlightID() != passenger.getFlightID())
            return false;

        var flightID = passenger.getFlightID();
        Flight flight = (Flight) flightRepository.getByID(flightID);

        if (!flight.checkPassenger(passenger))
            return false;

        return true;
    }
}
