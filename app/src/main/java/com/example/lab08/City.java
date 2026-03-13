package com.example.lab08;

import java.util.Objects;

public class City {
    private String city;
    private String province;

    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    public String getCityName() {
        return this.city;
    }

    public String getProvinceName() {
        return this.province;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City cityObj = (City) o;
        return Objects.equals(this.city, cityObj.city) &&
                Objects.equals(this.province, cityObj.province);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}