package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;
import java.util.Objects;

public class WeatherReporter {

    public static final String LONDON = "London";
    public static final String CALIFORNIA = "California";
    public static final String CAPE_TOWN = "Cape Town";
    public static final int HEAT = 30;
    public static final int COLD = 10;
    public static final String LONDON_PICTURE = "🌦";
    public static final String CALIFORNIA_PICTURE = "🌅";
    public static final String CAPE_TOWN_PICTURE = "🌤";
    public static final String LOCATION_PICTURE = "🔆";
    public static final String IT_S_TOO_HOT = "It's too hot 🥵!";
    public static final String IT_S_TOO_COLD = "It's too cold 🥶!";
    public static final String IT_S_JUST_RIGHT = "Ahhh...it's just right 😊!";
    private final String location;
    private final double temperature;

    public WeatherReporter(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    public String printWeatherReport() {
        double newTemp = convertToFahrenheit();
        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.", location, checkLocation(), checkTemperature(), newTemp);
    }

    private double convertToFahrenheit() {
        return (9.0 / 5.0) * temperature + 32;
    }

    public String checkLocation() {
        if (Objects.equals(location, LONDON)) {

            return LONDON_PICTURE;

        } else if (Objects.equals(location, CALIFORNIA)) {

            return CALIFORNIA_PICTURE;

        } else if (Objects.equals(location, CAPE_TOWN)) {

            return CAPE_TOWN_PICTURE;

        }
        return LOCATION_PICTURE;
    }

    public String checkTemperature() {
        if (temperature > HEAT) {

            return IT_S_TOO_HOT;

        } else if (temperature < COLD) {

            return IT_S_TOO_COLD;

        }
        return IT_S_JUST_RIGHT;
    }

}
