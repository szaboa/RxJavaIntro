package com.example.aszabo.rxjavaintro.api;

import com.example.aszabo.rxjavaintro.model.GithubUser;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GithubService {

    @GET("/users/{username}")
    Observable<GithubUser> getUser(@Path("username") String user);
}
