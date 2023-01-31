package com.techreturners.encapsulation.bankaccount.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.techreturners.encapsulation.bankaccount.model.WeatherReporter.*;
import static org.junit.jupiter.api.Assertions.*;

class WeatherReporterTest {
    WeatherReporter london;
    WeatherReporter california;
    WeatherReporter capeTown;
    WeatherReporter location;

    @BeforeEach
    void setUp() {
        london = new WeatherReporter(LONDON, 13);
        california = new WeatherReporter(CALIFORNIA, 43);
        capeTown = new WeatherReporter(CAPE_TOWN, 5);
        location = new WeatherReporter("OTHER", 23);
    }

    @Test
    void shouldReturnValidWeatherReport() {
        String actual = london.printWeatherReport();
        assertEquals("I am in London and it is \uD83C\uDF26. Ahhh...it'actual just right \uD83D\uDE0A!. The temperature in Fahrenheit is 55.4.", actual);
    }

    @Test
    void checkLocation() {
        String actualLondon = london.checkLocation();
        String actualCalifornia = california.checkLocation();
        String actualCapeTown = capeTown.checkLocation();
        String actualLocation = location.checkLocation();

        assertEquals(LONDON_PICTURE, actualLondon);
        assertEquals(CALIFORNIA_PICTURE, actualCalifornia);
        assertEquals(CAPE_TOWN_PICTURE, actualCapeTown);
        assertEquals(LOCATION_PICTURE, actualLocation);

    }

    @Test
    void checkTemperature() {
        String right = london.checkTemperature();
        String hot = california.checkTemperature();
        String cold = capeTown.checkTemperature();

        assertEquals(IT_S_JUST_RIGHT, right);
        assertEquals(IT_S_TOO_HOT, hot);
        assertEquals(IT_S_TOO_COLD, cold);
    }

}