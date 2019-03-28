package com.company.HW5;

import com.company.HW5.entity.Planet;
import com.company.HW5.entity.Satellite;
import com.company.HW5.entity.Star;
import com.company.HW5.implementation.StarSystemManagerImpl;
import com.company.HW5.manager.StarSystemManager;
import com.company.HW5.repository.StarSystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Star star = new Star("Sun",1391000);
        ArrayList<Planet> planets = new ArrayList<>();
        ArrayList<Satellite> satellites = new ArrayList<>();
        satellites.add(new Satellite("Moon",3474));
        planets.add(new Planet("Earth",12742,satellites));
        planets.add(new Planet("Venus",6051));

        StarSystem starSystem = new StarSystem(star,planets);

        StarSystemManager starSystemManager = new StarSystemManagerImpl(starSystem);

        Runner runner = new Runner(starSystemManager);
        runner.run();
    }
}
