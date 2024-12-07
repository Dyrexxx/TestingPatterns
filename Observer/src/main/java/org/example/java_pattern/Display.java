package org.example.java_pattern;


import org.example.my_pattern.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class Display implements Observer, DisplayElement {
    private Observable observable;
    private String cityName;
    private String address;

    public Display(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.cityName = weatherData.getCityName();
            this.address = weatherData.getAddress();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println(cityName + " " + address);
    }
}
