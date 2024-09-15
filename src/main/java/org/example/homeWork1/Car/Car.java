package org.example.homeWork1.Car;

public class Car implements Drivable {

    private String carBrand;
    private String carType;
    private int carYearReleased;

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarType() {
        return carType;
    }

    public int getCarYearReleased() {
        return carYearReleased;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setCarYearReleased(int carYearReleased) {
        this.carYearReleased = carYearReleased;
    }


    @Override
    public void start() {
        System.out.println("Заводим двигатель.");
    }

    @Override
    public void stop() {
        System.out.println("Глушим двигатель.");
    }

    @Override
    public void drive(double distance) {
        System.out.printf("Только что автомобиль проехал %s метра(ов)\n", String.format("%.2f", distance));
    }
}