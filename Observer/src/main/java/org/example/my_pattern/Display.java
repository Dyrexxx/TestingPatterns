package org.example.my_pattern;

public class Display implements Observer, DisplayElement {
    private WeatherData weatherData;
    private String cityName;
    private String address;

    public Display(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, String cityName, String address) {
        this.cityName = cityName;
        this.address = address;
        display();
    }

    @Override
    public void display() {
        System.out.println(cityName + " " + address);
    }
}
