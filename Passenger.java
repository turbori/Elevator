package com.example.elevatorsimulator;

public abstract class Passenger {
    protected int passengerID;
    protected int startFloor;
    protected int endFloor;



    public Passenger(int _passengerID, int _startFloor,int _endFloor){
        this.passengerID = _passengerID;
        this.startFloor = _startFloor;
        this.endFloor = _endFloor;

    }

    public abstract boolean requestElevator(direction _direction, SimulationSettings _settings);
}
