package org.example.my_pattern;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private int temperature;
    private String cityName;
    private String address;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if (index != -1) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, cityName, address);
        }
    }
    public void changed() {
        notifyObservers();
    }
    public void setArguments(int temperature, String cityName, String address) {
        this.temperature = temperature;
        this.cityName = cityName;
        this.address = address;
        changed();

    }
}
