package com.example.elevatorsimulator;

public class ExpressElevator extends Elevator{
    public ExpressElevator(int _elevatorID, String _elevatorType, int _weightCapacity) {
        super(_elevatorID, _elevatorType, _weightCapacity);
    }

    @Override
    public boolean move(direction _direction) {
        return false;
    }
}
