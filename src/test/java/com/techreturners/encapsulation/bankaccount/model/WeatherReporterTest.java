package com.techreturners.encapsulation.bankaccount.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.techreturners.encapsulation.bankaccount.model.Location.*;
import static com.techreturners.encapsulation.bankaccount.model.WeatherComment.*;
import static com.techreturners.encapsulation.bankaccount.model.WeatherEmoji.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class WeatherReporterTest {
    WeatherReporter london;
    WeatherReporter california;
    WeatherReporter capeTown;
    WeatherReporter other;

    @BeforeEach
    void setUp() {
        london = new WeatherReporter(LONDON, 13);
        california = new WeatherReporter(CALIFORNIA, 43);
        capeTown = new WeatherReporter(CAPE_TOWN, 5);
        other = new WeatherReporter(OTHER, 23);
    }

    @Test
    void shouldReturnValidWeatherReportTest() {
        String actual = london.printWeatherReport();
        assertEquals("I am in LONDON and it is \uD83C\uDF26. Ahhh...it's just right \uD83D\uDE0A!. The temperature in Fahrenheit is 55.4.", actual);
    }

    @Test
    void shouldReturnValidEmodjiTest() {
        String actualLondon = london.getEmojiNyLocation();
        String actualCalifornia = california.getEmojiNyLocation();
        String actualCapeTown = capeTown.getEmojiNyLocation();
        String actualOther = other.getEmojiNyLocation();

        assertEquals(LONDON_EMOJI.getEmoji(), actualLondon);
        assertEquals(CALIFORNIA_EMOJI.getEmoji(), actualCalifornia);
        assertEquals(CAPE_TOWN_EMOJI.getEmoji(), actualCapeTown);
        assertEquals(OTHER_EMOJI.getEmoji(), actualOther);

    }

    @Test
    void checkTemperature() {
        String right = london.getTemperatureComment();
        String hot = california.getTemperatureComment();
        String cold = capeTown.getTemperatureComment();

        assertEquals(RIGHT.getComment(), right);
        assertEquals(FREEZING.getComment(), cold);
        assertEquals(HOT.getComment(), hot);
    }

}
