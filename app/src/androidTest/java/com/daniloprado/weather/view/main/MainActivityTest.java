package com.daniloprado.weather.view.main;

import android.support.test.runner.AndroidJUnit4;
import com.daniloprado.weather.view.main.view.CityList;
import org.junit.Test;
import org.junit.runner.RunWith;




@RunWith(AndroidJUnit4.class)
public class MainActivityTest extends GenericTest {

    private String searchCity1 = new String("Lisbon");
    private String searchResult1 = new String("Lisbon, Lisbon, Portugal");

    @Test
    public void addCity() {
        new CityList()
                .addCity()
                .addName(searchCity1,searchResult1);
    }

    @Test
    public void checkWeather() {
        new CityList()
                .openCity(searchCity1)
                .checkWeather()
                .pressBack();
    }


}
