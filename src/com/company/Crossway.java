package com.company;

import java.util.Arrays;

/**
 * Created by Женя on 20.05.2016.
 */
public class Crossway {
    Transport[] dayTraffic;

    // Constructor
    public Crossway(){
        dayTraffic = new Transport[]{new Motorcycle("Honda", "AA 111-14 E"),
                new Truck("KAMAZ", "СА 231-99 В"),
                new Vehicle("Renault", "AK 767-23 C"), new Motorcycle("Yamaha", "СА 234-34 В")};
    }

    public Transport[] getDayTraffic() {
        return dayTraffic;
    }

    /**
     * This method searches transport in traffic
     * @param obj transport
     * @return true if found
     */
    public boolean isPassed(Transport obj){
        for (Transport transport : dayTraffic){
            if (transport.equals(obj)){
                return true;
            }
        }
        return false;
    }

    /**
     * This method count number of truck that passed during day
     * @return integer value
     */
    public int trucksPassedNumber(){
        int counter = 0;
        for (Transport transport : dayTraffic){
            if (transport instanceof Truck){
                counter++;
            }
        }
        return counter;
    }

    /**
     * This method count number of motorcycle that passed during day
     * @return integer value
     */
    public int motorcyclesPassedNumber(){
        int counter = 0;
        for (Transport transport : dayTraffic){
            if (transport instanceof Motorcycle){
                counter++;
            }
        }
        return counter;
    }

    /**
     * This method count number of vehicle that passed during day
     * @return integer value
     */
    public int vehiclesPassedNumber(){
        int counter = 0;
        for (Transport transport : dayTraffic){
            if (transport instanceof Vehicle){
                counter++;
            }
        }
        return counter;
    }



    @Override
    public String toString(){
        return "Day traffic " +
                Arrays.toString(dayTraffic) +
                "\nTransports today: " + dayTraffic.length;
    }


}
