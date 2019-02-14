package com.burahan.cities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class City
{
    private @Id @GeneratedValue Long id;
    private String cityName;

    public City()
    {
        // default constructor
    }

    public City(String cityName)
    {
        this.cityName = cityName;
    }
}
