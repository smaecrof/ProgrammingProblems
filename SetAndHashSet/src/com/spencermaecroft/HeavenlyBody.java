package com.spencermaecroft;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by SMC on 08/09/2020
 */
public final class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitPeriod){
        this.name = name;
        this.orbitalPeriod = orbitPeriod;
        this.satellites = new HashSet<HeavenlyBody>();
    }

    public boolean addMoon(HeavenlyBody moon){
        return this.satellites.add(moon);
    }

    public String getName(){
        return this.name;
    }

    public double getOrbitalPeriod(){
        return this.orbitalPeriod;
    }

    public Set<HeavenlyBody> getSatellites(){
        return new HashSet<>(this.satellites);
    }


    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());

        if((obj == null) || (obj.getClass() != this.getClass())){
            return false;
        }

        String objName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName);
    }
}
