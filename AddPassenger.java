package com.example.elevatorsimulator;

//Constructors
public class AddPassenger {
    private String passengerType;
    private int passengerId;
    private int floor;
    private int priority;

    AddPassenger(String _passengerType,int _passengerId,int _floor, int _priority){
        this.floor = _floor;
        this.passengerId=_passengerId;
        this.passengerType = _passengerType;
        this.priority = _priority;
    }
    AddPassenger(AddPassenger p){
        this.floor = p.floor;
        this.passengerId= p.passengerId;
        this.passengerType = p.passengerType;
        this.priority = p.priority;
    }






}
