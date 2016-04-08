package com.example.mjozefow.appka.rest.datamodel;

import com.google.gson.annotations.SerializedName;

public class CurrentWeather {
    public static final double FROM_KELVIN_TO_CELSIUS_FACTOR = -272.15;
    //{"main":{"temp":286.15,"pressure":1005,"humidity":50,"temp_min":286.15,"temp_max":286.15},

    @SerializedName("temp")
    public double temperature;
    @SerializedName("pressure")
    public double pressureInHPa;
    public double humidity;

    public CurrentWeather(Double temperature, Double pressure, Double humidity) {
        this.temperature = temperature;
        this.pressureInHPa = pressure;
        this.humidity = humidity;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature + FROM_KELVIN_TO_CELSIUS_FACTOR;
    }

    public double getPressureInHPa() {
        return pressureInHPa;
    }

    public void setPressureInHPa(double pressureInHPa) {
        this.pressureInHPa = pressureInHPa;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "CurrentWeather{" +
                "temperature=" + temperature + " Celsius degree\n" +
                ", pressure=" + pressureInHPa + " hPa\n" +
                ", humidity=" + humidity + " %" +
                '}';
    }
}
