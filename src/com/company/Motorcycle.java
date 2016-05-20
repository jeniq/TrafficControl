package com.company;

/**
 * Created by Женя on 20.05.2016.
 */
public class Motorcycle extends Transport{
    private String model;
    private String number;

    // Constructor
    public Motorcycle(String model, String number){
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
        return "Motorcycle { " +
                "model" + model +
                ", number" + number +
                "}";
    }
}
