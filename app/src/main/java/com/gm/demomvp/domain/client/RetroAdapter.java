package com.gm.demomvp.domain.client;

import com.gm.demomvp.domain.api.RecpiyService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Name       : Gowtham
 * Created on : 22/3/17.
 * Email      : goutham.gm11@gmail.com
 * GitHub     : https://github.com/goutham106
 */

public class RetroAdapter {

    private static final RetroAdapter ourInstance = new RetroAdapter();

    public Retrofit retrofit;
    public RecpiyService service;

    public static RetroAdapter getInstance() {
        return ourInstance;
    }

    private RetroAdapter() {
    }

    public Retrofit getRetrofit(){
        return retrofit = new Retrofit.Builder()
                .baseUrl("http://www.recipepuppy.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public RecpiyService getRecipyService(){
        return service = getRetrofit().create(RecpiyService.class);
    }


}
