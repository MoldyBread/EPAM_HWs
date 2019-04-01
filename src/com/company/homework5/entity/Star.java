package com.company.homework5.entity;

import java.util.Objects;

public class Star {
    private final String name;
    private double radius;

    public Star(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Star{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Star star = (Star) o;
        return Double.compare(star.radius, radius) == 0 &&
                name.equals(star.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, radius);
    }
}