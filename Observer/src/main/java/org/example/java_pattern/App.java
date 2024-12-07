package org.example.java_pattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WeatherData weatherData = new WeatherData();
        Display display1 = new Display(weatherData);
        Display display2 = new Display(weatherData);
        weatherData.setArgumentChanged(10, "Пенза", "ул. Ладожская");
        weatherData.setArgumentChanged(30, "Москва", "ул. Пушкина");
    }
}
