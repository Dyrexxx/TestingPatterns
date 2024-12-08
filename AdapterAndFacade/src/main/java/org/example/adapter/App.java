package org.example.adapter;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Car car = new AudiCar();
        test(car);
        Duck duck = new UtinDuck();
        duck.quack();
        duck.fly();
        test(new DuckCarAdapter(duck));
    }

    private static void test(Car car) {
        car.signal();
        car.drive();
    }
}
