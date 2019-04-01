package com.company.homework3;

public class CarRepository {

    public static final int DEFAULT_NUMBER_OF_CARS = 5;
    private Car[] cars;

    public CarRepository(Car[] cars) {
        this.cars = cars;
    }

    public CarRepository(){
        cars = new Car[DEFAULT_NUMBER_OF_CARS];
    }

    public Car[] getByBrand(String brand){
        Car[] res = new Car[cars.length];

        int i=0;
        for (Car car:cars) {
            if(car.getCarBrand().toLowerCase().equals(brand.toLowerCase())){
                res[i]=car;
                i++;
            }
        }

        return normalizeArray(res,i);
    }

    public Car[] getByModelAndExploitation(String model,short n){
        Car[] res = new Car[cars.length];

        int i=0;
        for (Car car:cars) {
            if(car.getModel().toLowerCase().equals(model.toLowerCase())&&(short)2019-car.getYearOfManufacture()>n){
                res[i]=car;
                i++;
            }
        }

        return normalizeArray(res,i);
    }

    public Car[] getByYearAndQuotedPrice(short year,int price){
        Car[] res = new Car[cars.length];

        int i=0;
        for (Car car:cars) {
            if(year==car.getYearOfManufacture()&& car.getPrice()>price){
                res[i]=car;
                i++;
            }
        }

        return normalizeArray(res,i);
    }

    private Car[] normalizeArray(Car[] cars,int notNullCount){
        Car[] res = new Car[notNullCount];
        for (int i = 0; i < res.length; i++) {
            res[i]=cars[i];
        }
        return res;
    }

}
