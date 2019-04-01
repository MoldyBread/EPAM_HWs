package com.company.homework3;

import java.util.Scanner;

public class Ui {
    private CarService carService;
    private Scanner scanner;

    public Ui(CarService carService) {
        this.carService = carService;
        this.scanner = new Scanner(System.in);
    }

    public void run(){
        String s;
        short year;
        int price;
        System.out.println("Hello!");
        System.out.println("Cars of which brand do you want to see:");
        s=scanner.nextLine();
        show(carService.getByBrand(s));
        System.out.println();

        System.out.println("Write model of car:");
        s=scanner.nextLine();
        System.out.println("And number of years car was exploited:");
        year= scanner.nextShort();
        show(carService.getByModelAndExploitation(s,year));
        System.out.println();

        System.out.println("Write year:");
        year= scanner.nextShort();
        System.out.println("And price:");
        price=scanner.nextInt();
        show(carService.getByYearAndQuotedPrice(year,price));
    }

    private void show(Car[] cars){
        for (Car car:cars) {
            System.out.println(car);
        }
    }

}
