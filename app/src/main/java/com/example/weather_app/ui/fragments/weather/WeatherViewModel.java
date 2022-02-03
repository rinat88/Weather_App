package com.example.weather_app.ui.fragments.weather;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.weather_app.App;
import com.example.weather_app.common.Resource;
import com.example.weather_app.data.models.MainWeather;

public class WeatherViewModel  extends ViewModel {
    public LiveData<Resource<MainWeather>> liveData;

    public WeatherViewModel() {
    }

    public void getWeather(){
        liveData= App.repository.getWeather();
    }
}
