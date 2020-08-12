package com.spencermaecroft;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by SMC on 08/11/2020
 */
public class Main {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
//        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);
//
//        temp = new HeavenlyBody("Venus", 225);
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);
//
//        temp = new HeavenlyBody("Earth", 365);
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);
//
//        HeavenlyBody tempMoon = new HeavenlyBody("Moon",27);
//        solarSystem.put(temp.getName(), tempMoon);
//        temp.addMoon(tempMoon);
//
//        temp = new HeavenlyBody("Mars", 687);
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);
//
//        tempMoon = new HeavenlyBody("Deimos", 1.3);
//        solarSystem.put(tempMoon.getName(), tempMoon);
//        temp.addMoon(tempMoon);
//
//        tempMoon = new HeavenlyBody("Phobos", 0.3);
//        solarSystem.put(tempMoon.getName(), tempMoon);
//        temp.addMoon(tempMoon);
//
//        temp = new HeavenlyBody("Jupiter", 4332);
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);
//
//        tempMoon = new HeavenlyBody("Io", 1.8);
//        solarSystem.put(tempMoon.getName(), tempMoon);
//        temp.addMoon(tempMoon);
//
//        tempMoon = new HeavenlyBody("Europa", 3.5);
//        solarSystem.put(tempMoon.getName(), tempMoon);
//        temp.addMoon(tempMoon);
//
//        tempMoon = new HeavenlyBody("Ganymede", 7.1);
//        solarSystem.put(tempMoon.getName(), tempMoon);
//        temp.addMoon(tempMoon);
//
//        tempMoon = new HeavenlyBody("Callisto", 16.7);
//        solarSystem.put(tempMoon.getName(), tempMoon);
//        temp.addMoon(tempMoon);
//
//        temp = new HeavenlyBody("Saturn", 10759);
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);
//
//        temp = new HeavenlyBody("Uranus", 30660);
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);
//
//        temp = new HeavenlyBody("Neptune", 165);
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);
//
//        temp = new HeavenlyBody("Pluto", 248);
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);
//
//        System.out.println("Planets");
//        for(HeavenlyBody planet: planets){
//            System.out.println("\t" + planet.getName());
//            for(HeavenlyBody moon: planet.getSatellites()){
//                System.out.println("\t\t" + moon.getName());
//            }
//        }
//
//        Set<HeavenlyBody> moons = new HashSet<>();
//        for(HeavenlyBody planet:planets){
//            moons.addAll(planet.getSatellites());
//        }
//
//        System.out.println("All Moons");
//        for(HeavenlyBody moon: moons){
//            System.out.println("\t" + moon.getName());
//        }
//
//        HeavenlyBody pluto = new HeavenlyBody("Pluto",842);
//        planets.add(pluto);
//
//        for(HeavenlyBody planet : planets){
//            System.out.println(planet.getName() + ": " + planet.getOrbitalPeriod());
//        }
//
//        Object o = new Object();
//        o.equals(0);
//        "pluto".equals("");
        
        Planet tempPlanet = new Planet("Mercury", 88);
        solarSystem.put(tempPlanet.getName(), tempPlanet);
        planets.add(tempPlanet);

        tempPlanet = new Planet("Venus", 225);
        solarSystem.put(tempPlanet.getName(), tempPlanet);
        planets.add(tempPlanet);

        tempPlanet = new Planet("Earth", 365);
        solarSystem.put(tempPlanet.getName(), tempPlanet);
        planets.add(tempPlanet);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon",27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        tempPlanet.addSatellite(tempMoon);

        tempPlanet = new Planet("Mars", 687);
        solarSystem.put(tempPlanet.getName(), tempPlanet);
        planets.add(tempPlanet);

        tempMoon = new Moon("Deimos", 1.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        tempPlanet.addSatellite(tempMoon);

        tempMoon = new Moon("Phobos", 0.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        tempPlanet.addSatellite(tempMoon);

        tempPlanet = new Planet("Jupiter", 4332);
        solarSystem.put(tempPlanet.getName(), tempPlanet);
        planets.add(tempPlanet);

        tempMoon = new Moon("Io", 1.8);
        solarSystem.put(tempMoon.getName(), tempMoon);
        tempPlanet.addSatellite(tempMoon);

        tempMoon = new Moon("Europa", 3.5);
        solarSystem.put(tempMoon.getName(), tempMoon);
        tempPlanet.addSatellite(tempMoon);

        tempMoon = new Moon("Ganymede", 7.1);
        solarSystem.put(tempMoon.getName(), tempMoon);
        tempPlanet.addSatellite(tempMoon);

        tempMoon = new Moon("Callisto", 16.7);
        solarSystem.put(tempMoon.getName(), tempMoon);
        tempPlanet.addSatellite(tempMoon);

        tempPlanet = new Planet("Saturn", 10759);
        solarSystem.put(tempPlanet.getName(), tempPlanet);
        planets.add(tempPlanet);

        tempPlanet = new Planet("Uranus", 30660);
        solarSystem.put(tempPlanet.getName(), tempPlanet);
        planets.add(tempPlanet);

        tempPlanet = new Planet("Neptune", 165);
        solarSystem.put(tempPlanet.getName(), tempPlanet);
        planets.add(tempPlanet);

        tempPlanet = new Planet("Pluto", 248);
        solarSystem.put(tempPlanet.getName(), tempPlanet);
        planets.add(tempPlanet);

        System.out.println("Planets");
        for(HeavenlyBody planet: planets){
            System.out.println("\t" + planet.getName());
            for(HeavenlyBody moon: planet.getSatellites()){
                System.out.println("\t\t" + moon.getName());
            }
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet:planets){
            moons.addAll(planet.getSatellites());
        }

        System.out.println("All Moons");
        for(HeavenlyBody moon: moons){
            System.out.println("\t" + moon.getName());
        }

        System.out.println("Planets and their orbital period");
        for(HeavenlyBody planet : planets){
            System.out.println(planet.getName() + ": " + planet.getOrbitalPeriod());
        }

        Moon eclipse = new Moon("Eclipse", 2001);
        Planet eclipseP = new Planet("Eclipse", 2001);

        System.out.println(moons.equals(eclipseP));
        System.out.println(eclipseP.equals(eclipse));


    }
}
