package com.company.HW3;

import java.awt.*;

public class Main {

    public static final int CAR_MAX = 5;

    public static void main(String[] args) {
        Car[] cars = new Car[CAR_MAX];

        cars[0]=new Car("Ford","Focus", (short) 2005, Color.BLACK,1200000,"ca123fl");
        cars[1]=new Car("Mercedes-Benz","GL 350", (short) 2016, Color.WHITE,30000000,"fu433fa");
        cars[2]=new Car("Mercedes-Benz","CLS", (short) 2019, Color.RED,15000000,"si337sa");
        cars[3]=new Car("Mazda","CX-5", (short) 2016, Color.GREEN,5000000,"sh228ga");
        cars[4]=new Car("Ford","Focus", (short) 2007, Color.BLUE,400000,"kz505ka");

        CarRepository carRepository = new CarRepository(cars);
        CarService carService = new CarService(carRepository);

        Ui ui = new Ui(carService);
        ui.run();
    }
}
