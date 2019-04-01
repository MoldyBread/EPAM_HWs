package com.company.homework5.repository;

import com.company.homework5.entity.Planet;
import com.company.homework5.entity.Star;

import java.util.ArrayList;
import java.util.Objects;

public class StarSystem {
    private final Star star; //Only one star in my star systems
    private ArrayList<Planet> planetList; //Satellites list inside every planet

    public StarSystem(Star star, ArrayList<Planet> planetList) {
        this.planetList = planetList;
        this.star = star;
    }

    public void addPlanet(Planet planet){
        planetList.add(planet);
    }

    public String getStarName(){
        return star.getName();
    }

    public int getPlanetCount(){
        return planetList.size();
    }

    @Override
    public String toString() {
        return "StarSystem{" +
                "star=" + star +
                ", \nplanetList=" + (planetList==null?"No planets":planetList) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StarSystem that = (StarSystem) o;
        return Objects.equals(star, that.star) &&
                Objects.equals(planetList, that.planetList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(star, planetList);
    }
}