package com.company.HW3;

import java.awt.Color;

public class Car {
    private String carBrand;
    private String model;
    private short yearOfManufacture;
    private Color color;
    private int price;
    private String numberOfRegistration;

    public Car(String carBrand, String model, short yearOfManufacture, Color color, int price, String numberOfRegistration) {
        this.carBrand = carBrand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
        this.price = price;
        this.numberOfRegistration = numberOfRegistration;
    }

    public Car(String carBrand, String model) {
        this.carBrand = carBrand;
        this.model = model;
    }

    public Car(String carBrand, Color color, int price, String numberOfRegistration) {
        this.carBrand = carBrand;
        this.color = color;
        this.price = price;
        this.numberOfRegistration = numberOfRegistration;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public short getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(short yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getNumberOfRegistration() {
        return numberOfRegistration;
    }

    public void setNumberOfRegistration(String numberOfRegistration) {
        this.numberOfRegistration = numberOfRegistration;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", color=" + color +  //Color is shown as rgb of java.awt
                ", price=" + price +
                ", numberOfRegistration='" + numberOfRegistration + '\'' +
                '}';
    }
}
