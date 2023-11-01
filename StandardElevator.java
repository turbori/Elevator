package com.example.elevatorsimulator;

public class StandardElevator extends Elevator {

    public StandardElevator(int _elevatorID, String _elevatorType, int _weightCapacity) {
        super(_elevatorID, _elevatorType, _weightCapacity);
    }

    @Override
    public boolean move(direction _direction) {
        return false;
    }
}


