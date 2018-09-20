package com.forecast;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class GMap {

    @Autowired
    private WeatherService wservice;

    @RequestMapping("/map")
    public List<City> getAllCities() {

        return wservice.getCities();

    }

    @RequestMapping("/map/{s}")
    public City getCity(@PathVariable String s){

        return wservice.getCity(s);
    }

    @RequestMapping(method=RequestMethod.POST, value="/map")
    public void addCity(@RequestBody City c) {
        wservice.addCity(c);

    }


}
