package com.example.mjozefow.appka.rest.datamodel;

public class MainMessage {
    private CurrentWeather main;

    public CurrentWeather getMain() {
        return main;
    }

    public void setMain(CurrentWeather main) {
        this.main = main;
    }

    @Override
    public String toString() {
        return "MainMessage{" +
                "main='" + main + '\'' +
                '}';
    }
}
