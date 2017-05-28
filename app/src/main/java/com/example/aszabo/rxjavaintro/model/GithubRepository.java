package com.example.aszabo.rxjavaintro.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by aszabo on 5/28/17.
 */

public class GithubRepository {
    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}