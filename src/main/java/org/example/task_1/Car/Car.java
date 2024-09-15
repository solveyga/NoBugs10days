package org.example.task_1.Car;

public class Car implements Drivable{
    private String brand;
    private String model;
    private int year;

    private double position;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPosition(double position) {
        this.position = position;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPosition() {
        return position;
    }

    @Override
    public void start() {
        getPosition();
    }

    @Override
    public void stop() {
        System.out.println("Car stop at " + this.position);
    }

    @Override
    public double distance(double distance) {
        this.position += distance;
        return position;
    }
}
