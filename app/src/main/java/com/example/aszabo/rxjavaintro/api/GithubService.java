package com.example.aszabo.rxjavaintro.api;

import com.example.aszabo.rxjavaintro.model.GithubRepository;
import com.example.aszabo.rxjavaintro.model.GithubUser;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GithubService {

    @GET("/users/{username}")
    Observable<GithubUser> getUser(@Path("username") String user);

    @GET("users/{username}/repos")
    Observable<List<GithubRepository>> getRepositories(@Path("username") String user);
}
