package com.daniloprado.weather.view.main.view;



public class CityList {



    public AddCity addCity() {


        return new AddCity();

    }

    public Weather openCity(String city) {

        return new Weather(city);
    }
}
