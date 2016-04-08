package com.example.mjozefow.appka.rest.client;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.mjozefow.appka.MainActivity;
import com.example.mjozefow.appka.R;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.TextView;

public class CurrentWeatherOnWroclawRequestAction implements View.OnClickListener {

    private final MainActivity ctx;
    private final TextView responseText;

    public CurrentWeatherOnWroclawRequestAction(MainActivity ctx) {
        this.ctx = ctx;
        this.responseText = (TextView) ctx.findViewById(R.id.responseTextView);
    }

    @Override
    public void onClick(View v) {
        StringRequest wroclawWeatherRequest = getWroclawWeatherRequest("http://api.openweathermap.org/data/2.5/weather?q=Wroc%C5%82aw&APPID=3284770c2ddb98afdead8bc6290a85c5");
        RequestQueue queue = Volley.newRequestQueue(ctx);
        queue.add(wroclawWeatherRequest);
    }

    @NonNull
    private StringRequest getWroclawWeatherRequest(String url) {
        FetchCurrentWeatherInWroclawAction response = new FetchCurrentWeatherInWroclawAction(responseText);
        return new StringRequest(url, response, response);
    }

}