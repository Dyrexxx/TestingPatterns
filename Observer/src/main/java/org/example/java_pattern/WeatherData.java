package org.example.java_pattern;

import org.example.my_pattern.Observer;
import org.example.my_pattern.Subject;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable{
    private int temperature;
    private String cityName;
    private String address;

    public WeatherData() {

    }
    public void changed() {
        setChanged();
        notifyObservers();
    }
    public void setArgumentChanged(int temperature, String cityName, String address) {
        this.temperature = temperature;
        this.cityName = cityName;
        this.address = address;
        changed();
    }

    public int getTemperature() {
        return temperature;
    }

    public String getCityName() {
        return cityName;
    }

    public String getAddress() {
        return address;
    }
}
