package com.company.homework5.manager;

import com.company.homework5.entity.Planet;

public interface StarSystemManager {
    void addPlanet(Planet planet);
    String starName();
    int planetCount();
}