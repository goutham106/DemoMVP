package com.gm.demomvp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Name       : Gowtham
 * Created on : 22/3/17.
 * Email      : goutham.gm11@gmail.com
 * GitHub     : https://github.com/goutham106
 */

public class Recipy {

    @SerializedName("title")
    public String title;
    @SerializedName("version")
    public double version;
    @SerializedName("href")
    public String href;
    @SerializedName("results")
    public List<Results> results;

    public static class Results {
        @SerializedName("title")
        public String title;
        @SerializedName("href")
        public String href;
        @SerializedName("ingredients")
        public String ingredients;
        @SerializedName("thumbnail")
        public String thumbnail;
    }
}
