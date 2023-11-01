package com.example.elevatorsimulator;

public class StandardPassenger extends Passenger {
    public StandardPassenger(int _passengerID, int _startFloor, int _endFloor) {
        super(_passengerID, _startFloor, _endFloor);
    }

    @Override
    public  boolean requestElevator(direction _direction, SimulationSettings _settings) {

        return false;
    }
}
