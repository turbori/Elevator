package com.example.elevatorsimulator;
import com.example.elevatorsimulator.SimulationSettings;

public class FreightPassenger extends Passenger {

    public FreightPassenger(int _passengerID, int _startFloor, int _endFloor) {
        super(_passengerID, _startFloor, _endFloor);
    }

    @Override
    public boolean requestElevator(direction _direction, SimulationSettings _settings) {
        return false;
    }


}



