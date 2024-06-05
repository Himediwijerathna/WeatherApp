package com.himedi.weatherapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherService {
    @GET("weather")
    Call<WeatherResponse> getCurrentWeather(@Query("lat") double lat, @Query("lon") double lon, @Query("appid") String apiKey);
}
