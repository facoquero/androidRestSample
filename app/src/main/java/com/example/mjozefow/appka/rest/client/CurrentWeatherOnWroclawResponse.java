package com.example.mjozefow.appka.rest.client;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import android.util.Log;
import android.widget.TextView;

/**
 * Created by mjozefow on 28-03-2016.
 */
class CurrentWeatherOnWroclawResponse implements Response.Listener<String>, Response.ErrorListener {

    final private TextView responseTV;

    public CurrentWeatherOnWroclawResponse(TextView responseTV) {
        this.responseTV = responseTV;
    }

    @Override
    public void onResponse(String response) {
        Log.i("marjoz", response);
        responseTV.setText("Success message: " + response);
    }

    @Override
    public void onErrorResponse(VolleyError error) {
        Log.i("marjoz", "onErrorResponse: " + error);
        responseTV.setText("Error response: " + error);
    }
}
