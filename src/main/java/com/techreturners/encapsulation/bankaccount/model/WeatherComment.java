package com.techreturners.encapsulation.bankaccount.model;

enum WeatherComment {
    HOT ("It's too hot 🥵!"),
    FREEZING("It's too cold 🥶!"),
    RIGHT ("Ahhh...it's just right 😊!");
    private  String comment;

    WeatherComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }
}
