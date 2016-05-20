package com.company;

/**
 * Created by Женя on 20.05.2016.
 */
public abstract class Transport {
    public abstract String model();
    public abstract String number();

    @Override
    public String toString(){
        return "Transport { " +
                "model" + model() +
                ", number" + number()+
                "}";
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Transport temp = (Transport) obj;
        return (temp.number() == this.number()) && (temp.model() == this.model());
    }

}
