package com.example.mjozefow.appka.rest.json.deserializer;

import com.google.gson.JsonParser;

import com.example.mjozefow.appka.rest.datamodel.CurrentWeather;

import junit.framework.TestCase;

import org.junit.Test;

public class JsonWeatherParserTest extends TestCase {

    @Test
    public void testForMarshallingJsonObject() {

        String receivedMessage = "{\"coord\":{\"lon\":17.03,\"lat\":51.1}," +
                "\"weather\":[{\"id\":800,\"main\":\"Clear\"," +
                "\"description\":\"clear sky\",\"icon\":\"01n\"}]," +
                "\"base\":\"cmc stations\"," +
                "\"main\":{\"temp\":286.15,\"pressure\":1005,\"humidity\":50,\"temp_min\":286.15,\"temp_max\":286.15}," +
                "\"wind\":{\"speed\":5.7,\"deg\":170}," +
                "\"clouds\":{\"all\":0}," +
                "\"dt\":1459193400," +
                "\"sys\":{\"type\":1,\"id\":5375,\"message\":0.0079,\"country\":\"PL\",\"sunrise\":1459139640,\"sunset\":1459185606}," +
                "\"id\":3081368,\"name\":\"Wroclaw\",\"cod\":200}";


        CurrentWeather wroclawWeather = new JsonWeatherParser(new JsonParser()).parse(receivedMessage);

        assertEquals(14.0, wroclawWeather.getTemperature(), 0.01);
        assertEquals(50.0, wroclawWeather.getHumidity(), 0.01);
        assertEquals(1005.0, wroclawWeather.getPressureInHPa(), 0.01);
    }
}