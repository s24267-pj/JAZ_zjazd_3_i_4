package com.example.zjazd3.model;

public class Car {
    private String model = "Volkswagen";
    private int year = 2003;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
