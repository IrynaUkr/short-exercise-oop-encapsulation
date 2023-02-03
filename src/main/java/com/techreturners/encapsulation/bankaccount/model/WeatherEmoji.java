package com.techreturners.encapsulation.bankaccount.model;

public enum WeatherEmoji {

    LONDON_EMOJI("🌦"),
    CALIFORNIA_EMOJI("🌅"),
    CAPE_TOWN_EMOJI("🌤"),
    OTHER_EMOJI("🔆");
    private String emoji;

    WeatherEmoji(String emoji) {
        this.emoji = emoji;
    }

    public String getEmoji() {
        return emoji;
    }
}
