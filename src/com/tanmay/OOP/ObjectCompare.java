package com.tanmay.OOP;

import java.util.Arrays;
import java.util.List;

public class ObjectCompare {
    public static void main(String[] args) {
        Car tesla = new Car("Model 3", 350f);
        Car maruti = new Car("maruti", 110f);
        Car suzuki = new Car("suzuki", 210f);
        Car hyundai = new Car("hyundai", 210f);
        Car bmw = new Car("bmw", 320f);
//        if (tesla.compareTo(maruti) > 1) {
//            System.out.println("Tesla has more speed.");
//        }

        Car[] cars = {tesla, maruti, suzuki, hyundai, bmw};
        System.out.println(Arrays.toString(cars));
        Arrays.sort(cars);
        // Sorting is working because we implemented compareTo method.
        System.out.println(Arrays.toString(cars));




    }
}

class Car implements Comparable<Car> {
    String name;
    Float topSpeed;

    public Car(String name, Float topSpeed) {
        this.name = name;
        this.topSpeed = topSpeed;
    }

    @Override
    public int compareTo(Car o) {
        int diff = (int)(this.topSpeed - o.topSpeed);
        return diff;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", topSpeed=" + topSpeed +
                '}';
    }
}
