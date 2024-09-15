package org.example.homeWork1.Car;

public class CarDemo {

    public static void main(String[] args) {

        Car car = new Car();
        car.setCarBrand("Toyota");
        car.setCarType("Camry");
        car.setCarYearReleased(2022);

        car.start();
        car.drive(100);
        car.stop();
}
}
