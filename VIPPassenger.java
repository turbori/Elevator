package com.example.elevatorsimulator;

public class VIPPassenger extends Passenger {
        public VIPPassenger(int _passengerID, int _startFloor, int _endFloor) {
            super(_passengerID, _startFloor, _endFloor);
        }

        @Override
        public boolean requestElevator(direction _direction, SimulationSettings _settings) {
            return false;
        }
    }




