package com.example.weather_app.data.remote;

import com.example.weather_app.data.models.MainWeather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApi {
    @GET("data/2.5/weather")
    Call<MainWeather> getWeather(@Query("q") String cityName,
                                 @Query("appid") String appid,
                                 @Query("units") String units);
}
