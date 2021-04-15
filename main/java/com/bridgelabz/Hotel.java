package com.bridgelabz;


//Declaring name of hotel and rates
public class Hotel {
    private String name;
    private int regularCxRate;

    public Hotel(String name,int regularCxRate) {
        this.name = name;
        this.regularCxRate = regularCxRate;
    }

    @Override
    public String toString() {
        return "Hotel:"+name+" /tRegular Customer Rates: "+regularCxRate;
    }

}
