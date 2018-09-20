package com.forecast;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class WeatherService {

    private List<City> cities = new ArrayList<>(Arrays.asList(
            new City("Oslo",  59.913971, 10.752260),
                new City("Trondheim", 63.435280, 10.393468),
                new City("Bergen", 60.395810, 5.331776),
                new City("Stavanger",58.974964, 5.733652),
                new City("Kristiansand",58.164346, 8.020225)
    ));

    public List<City> getCities() {
        return cities;
    }

    public City getCity(String n) {
        return cities.stream().filter(c -> c.getName().equals(n)).findFirst().get();
    }

    public void addCity(City c){
        cities.add(c);
     }
}
