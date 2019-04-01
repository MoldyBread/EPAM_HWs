package com.company.homework5.implementation;

import com.company.homework5.repository.StarSystem;
import com.company.homework5.entity.Planet;
import com.company.homework5.manager.StarSystemManager;

public class StarSystemManagerImpl implements StarSystemManager {
    private StarSystem starSystem;

    public StarSystemManagerImpl(StarSystem starSystem) {
        this.starSystem = starSystem;
    }

    @Override
    public void addPlanet(Planet planet) {
        starSystem.addPlanet(planet);
    }

    @Override
    public String starName() {
        return starSystem.getStarName();
    }

    @Override
    public int planetCount() {
        return starSystem.getPlanetCount();
    }

    @Override
    public String toString() {
        return starSyst