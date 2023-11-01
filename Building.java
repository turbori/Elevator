package com.example.elevatorsimulator;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Building {

    private int numOfFloors = 30;
    ArrayList<Floor> Floors = new ArrayList<>();

    public Building(int _numOfFloors) {
        this.numOfFloors = _numOfFloors;
        this.Floors = new ArrayList<>();
    }


}