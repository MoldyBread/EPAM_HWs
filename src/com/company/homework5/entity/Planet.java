package com.company.homework5.entity;

import java.util.ArrayList;
import java.util.Objects;

public class Planet {
    private final String name;
    private double radius;
    private ArrayList<Satellite> satellitesList;

    public Planet(String name, double radius, ArrayList<Satellite> satellitesList) {
        this.name = name;
        this.radius = radius;
        this.satellitesList = satellitesList;
    }

    public Planet(String name, double radius) {
        this.name = name;
        this.radius = radius;
        satellitesList = null;
    }

    @Override
    public String toString() {
        return "\nPlanet{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                ", satellitesList=" + (satellitesList==null?"no satellites":satellitesList) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return Double.compare(planet.radius, radius) == 0 &&
                name.equals(planet.name) &&
                Objects.equals(satellitesList, planet.satellitesList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, radius, satellitesList);
    }

}