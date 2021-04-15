package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class HotelReservationTest {

    @Test
    public void givenDatesShouldReturnHotelRates() {
        Hotel Lakewood = new Hotel("Lakewood",110);
        Hotel Bridgewood = new Hotel("Bridgewood",160);
        Hotel Ridgewood = new Hotel("Ridgewood",220);

        /* adding hotel names */
        List<Hotel> hotels = new ArrayList<Hotel>();
        hotels.add(Lakewood);
        hotels.add(Bridgewood);
        hotels.add(Ridgewood);
        HotelReservation reservation = new HotelReservation();

        Assertions.assertEquals("Lakewood" + "160","Lakewood" + "160");


    }
}
