package com.company.homework5.entity;

import java.util.Objects;

public class Satellite {
    private final String name;
    private double radius;

    public Satellite(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Satellite satellite = (Satellite) o;
        return Double.compare(satellite.radius, radius) == 0 &&
                name.equals(satellite.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, radius);
    }

    @Override
    public String toString() {
        return "Satellite{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                '}';
    }
}