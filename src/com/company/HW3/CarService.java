package com.company.HW3;

public class CarService {
    private CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public CarService(){
        this.carRepository=new CarRepository();
    }

    public Car[] getByBrand(String brand){
       return carRepository.getByBrand(brand);
    }

    public Car[] getByModelAndExploitation(String model,short n) {
        return carRepository.getByModelAndExploitation(model,n);
    }

    public Car[] getByYearAndQuotedPrice(short year,int price){
        return carRepository.getByYearAndQuotedPrice(year,price);
    }
}
