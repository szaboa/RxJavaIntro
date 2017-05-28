package com.example.aszabo.rxjavaintro.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by aszabo on 5/28/17.
 */

public class GithubUser {
    @SerializedName("id")
    private int id;

    @SerializedName("login")
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
