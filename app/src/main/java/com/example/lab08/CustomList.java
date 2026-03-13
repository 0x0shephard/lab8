package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    /**
     * Checks if the list contains a specific city.
     * Implementation relies on City.equals()
     */
//    public boolean hasCity(City city) {
//        return cities.contains(city);
//    }

    public int countCities() {
        return cities.size();
    }
}