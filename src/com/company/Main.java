package com.company;

public class Main {

    public static void main(String[] args) {
        Crossway crossway = new Crossway();
        Transport motorcycle = new Motorcycle("Yamaha", "СА 234-34 В");
        Transport truck = new Truck("Yamaha", "СА 234-34 В");

        System.out.println(crossway.toString());
        System.out.println("Trucks: " + crossway.trucksPassedNumber());
        System.out.println("Motorcycles: " + crossway.motorcyclesPassedNumber());
        System.out.println(crossway.isPassed(motorcycle));
        System.out.println(crossway.isPassed(truck));
    }
}
