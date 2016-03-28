package com.example.mjozefow.appka.rest.client;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.mjozefow.appka.MainActivity;
import com.example.mjozefow.appka.R;

/**
 * Created by mjozefow on 28-03-2016.
 */
public class CurrentWeatherOnWroclawRequestAction implements View.OnClickListener {

    private final MainActivity ctx;
    private final TextView responseText;

    public CurrentWeatherOnWroclawRequestAction(MainActivity ctx) {
        this.ctx = ctx;
        this.responseText = (TextView) ctx.findViewById(R.id.responseTextView);
    }

    @Override
    public void onClick(View v) {
        RequestQueue queue = Volley.newRequestQueue(ctx);
        StringRequest wroclawWeatherRequest = getWroclawWeatherRequest("http://www.google.com");
        queue.add(wroclawWeatherRequest);
    }

    @NonNull
    private StringRequest getWroclawWeatherRequest(String url) {
        CurrentWeatherOnWroclawResponse response = new CurrentWeatherOnWroclawResponse(responseText);
        return new StringRequest(url, response, response);
    }

}