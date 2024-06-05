package com.Ganpat.Challenge86;

public class Car extends Vehicle{

    @Override
    public void Service() {
        super.Service();
        System.out.println("Car have to Clean First before service");
    }
}
