package com.example.elevatorsimulator;
enum direction{
    UP,
    IDLE,
    DOWN
}
public abstract class Elevator {
    protected int weightCapacity;
    protected int elevatorID;
    protected String elevatorType;

    public Elevator(int _elevatorID, String _elevatorType,int _weightCapacity){
        this.elevatorID = _elevatorID;
        this.elevatorType = _elevatorType;
        this.weightCapacity = _weightCapacity;

    }


    public abstract boolean move(direction _direction);
}
