package com.example.mjozefow.appka.rest.json.deserializer;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import com.example.mjozefow.appka.rest.datamodel.CurrentWeather;

import android.support.annotation.NonNull;

public class JsonWeatherParser {

    public static final String MAIN = "main";
    public static final String TEMP_TAG = "temp";
    public static final String PRESSURE_TAG = "pressure";
    public static final String HUMIDITY_TAG = "humidity";

    private final JsonParser parser;

    public JsonWeatherParser(JsonParser parser) {
        this.parser = parser;
    }

    @NonNull
    public CurrentWeather parse(String receivedMessage) {

        JsonObject el = parser.parse(receivedMessage).getAsJsonObject().get(MAIN).getAsJsonObject();

        Double temperature = getDoubleValue(String.valueOf(el.get(TEMP_TAG)));
        Double pressure = getDoubleValue(String.valueOf(el.get(PRESSURE_TAG)));
        Double humidity = getDoubleValue(String.valueOf(el.get(HUMIDITY_TAG)));

        CurrentWeather wroclawWeather = new CurrentWeather(temperature, pressure, humidity);
        wroclawWeather.setTemperature(temperature);
        wroclawWeather.setPressureInHPa(pressure);
        wroclawWeather.setHumidity(humidity);

        return wroclawWeather;
    }

    @NonNull
    private Double getDoubleValue(String literalRepresentation) {
        return Double.valueOf(literalRepresentation);
    }
}
