package com.company.HW5.manager;

import com.company.HW5.entity.Planet;

public interface StarSystemManager {
    void addPlanet(Planet planet);
    String starName();
    int planetCount();
}