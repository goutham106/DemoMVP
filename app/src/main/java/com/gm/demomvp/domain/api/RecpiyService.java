package com.gm.demomvp.domain.api;

import com.gm.demomvp.model.Recipy;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Name       : Gowtham
 * Created on : 22/3/17.
 * Email      : goutham.gm11@gmail.com
 * GitHub     : https://github.com/goutham106
 */

public interface RecpiyService {

    String NAME = "q";
    String PAGE = "p";

    //http://www.recipepuppy.com/api/?i=onions,garlic&q=omelet&p=3

    @GET("api")
    Call<Recipy> getRecipyBySearch(@Query(NAME) String query);


}
