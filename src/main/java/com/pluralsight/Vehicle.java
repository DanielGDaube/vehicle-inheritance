package com.pluralsight;

public class Vehicle {
    private String model;
    private String color;
    private int topSpeed;
    private int fuelCapacity;
    private int numberOfPassengers;
    private int cargoCapacity;

    public String getModel() {
        return model;
    }

    public Vehicle setModel(String model) {
        this.model = model;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Vehicle setColor(String color) {
        this.color = color;
        return this;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public Vehicle setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
        return this;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public Vehicle setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
        return this;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public Vehicle setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
        return this;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public Vehicle setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
        return this;
    }
}
