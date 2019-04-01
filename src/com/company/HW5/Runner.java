package com.company.HW5;

import com.company.HW5.entity.Planet;
import com.company.HW5.entity.Satellite;
import com.company.HW5.manager.StarSystemManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    private StarSystemManager starSystemManager;
    private Scanner scanner;

    public Runner(StarSystemManager starSystemManager) {
        this.starSystemManager = starSystemManager;
        scanner = new Scanner(System.in);
    }

    public void run(){
        System.out.println("Planets in our star system: "+starSystemManager.planetCount());
        System.out.println("Star name: "+starSystemManager.starName());
        System.out.println("Do you want to add planet?(yes/no)");
        if(scanner.nextLine().toLowerCase().equals("yes")){
            add();
        }

        System.out.println("Our star system:");
        System.out.println(starSystemManager.toString());
    }

    private void add(){
        System.out.println("First, does this planet has satellites?(yes/no)");
        if(scanner.nextLine().toLowerCase().equals("yes")){
            int count;
            ArrayList<Satellite> satellites = new ArrayList<>();

            System.out.println("How much satellites it has:");
            count=scanner.nextInt();

            for (int i = 0; i < count; i++) {
                System.out.println("Name of "+(i+1)+" satellite:");
                scanner.nextLine();
                String satName=scanner.nextLine();
                System.out.println("Radius of "+(i+1)+" satellite:");
                double satRadius=scanner.nextDouble();
                satellites.add(new Satellite(satName,satRadius));
            }

            System.out.println("Ok, now write planet name:");
            scanner.nextLine();
            String name=scanner.nextLine();
            System.out.println("And radius");
            double radius=scanner.nextDouble();

            starSystemManager.addPlanet(new Planet(name,radius,satellites));
        }else{
            System.out.println("Ok, write your planet name:");
            String name=scanner.nextLine();
            System.out.println("And radius");
            double radius=scanner.nextDouble();
            starSystemManager.addPlanet(new Planet(name,radius));
        }


    }
}
