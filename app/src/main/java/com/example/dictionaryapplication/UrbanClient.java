package com.example.dictionaryapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UrbanClient {

    @GET()
    Call<List> fetchInfo(@Query("term")String searchTerm);
}
