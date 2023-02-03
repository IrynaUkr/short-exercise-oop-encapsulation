package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;
import java.util.Objects;

import static com.techreturners.encapsulation.bankaccount.model.Location.*;
import static com.techreturners.encapsulation.bankaccount.model.WeatherComment.*;
import static com.techreturners.encapsulation.bankaccount.model.WeatherEmoji.*;

public class WeatherReporter {
    public static final int HEAT = 30;
    public static final int COLD = 10;


    private final Location location;
    private final double temperature;
    private WeatherEmoji emoji;

    public WeatherReporter(Location location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    public String printWeatherReport() {
        double newTemp = convertToFahrenheit();
        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.", location, getEmojiNyLocation(), getTemperatureComment(), newTemp);
    }

    private double convertToFahrenheit() {
        return (9.0 / 5.0) * temperature + 32;
    }

    public String getEmojiNyLocation() {
        if (Objects.equals(location, LONDON)) {

            return LONDON_EMOJI.getEmoji();

        } else if (Objects.equals(location, CALIFORNIA)) {

            return CALIFORNIA_EMOJI.getEmoji();

        } else if (Objects.equals(location, CAPE_TOWN)) {

            return CAPE_TOWN_EMOJI.getEmoji();

        }
        return OTHER_EMOJI.getEmoji();
    }

    public String getTemperatureComment() {
        if (temperature > HEAT) {

            return HOT.getComment();

        } else if (temperature < COLD) {

         return FREEZING.getComment();
        }
        return RIGHT.getComment();
    }

}
