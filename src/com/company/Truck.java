package com.company;

/**
 * Created by Женя on 20.05.2016.
 */
public class Truck extends Transport{
    private String model;
    private String number;

    // Constructor
    public Truck(String model, String number){
        this.model = model;
        this.number = number;
    }

    public String model() {
        return model;
    }

    public String number() {
        return number;
    }

    @Override
    public String toString(){
        return "Truck { " +
                "model" + model +
                ", number" + number +
                "}";
    }
}
