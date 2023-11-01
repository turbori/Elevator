package com.example.elevatorsimulator;
import com.example.elevatorsimulator.SimulationSettings;
import com.example.elevatorsimulator.direction;

public class GlassPassenger extends Passenger {

    public GlassPassenger(int _passengerID, int _startFloor, int _endFloor) {
        super(_passengerID, _startFloor, _endFloor);
    }


    public  boolean requestElevator(direction _direction, SimulationSettings _settings) {

        return false;
    }


}
