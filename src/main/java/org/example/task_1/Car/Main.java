package org.example.task_1.Car;

public class Main {
    public static void main(String[] args) {
        Car car_1 = new Car();
        car_1.setBrand("Test brand");
        car_1.setModel("Test model");
        car_1.setYear(1999);
        car_1.setPosition(0);

        car_1.start();
        car_1.distance(20);
        car_1.stop();

        car_1.start();
        car_1.distance(20);
        car_1.stop();
    }
}
