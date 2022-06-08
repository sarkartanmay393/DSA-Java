package com.tanmay.OOP;

import java.lang.annotation.Inherited;

public class Polymorphism {
    public static void main(String[] args) {
        Shapes c1 = new Circle();
        c1.name();

        Shapes b1 = new Box();
        // it will call the first constructor.
        Shapes b2 = new Box(5, 5);
        // it will call the second constructor.

    }
}

class Shapes {

    void name() {
        System.out.println("It's just a shape.");
    }

    void area() {
        System.out.println("Area is not defined yet.");
    }
}

class Box extends Shapes {
    // Here, Compile Time Polymorphism / Static Polymorphism works.
    // Three constructors with diff parameters.
    // At compile time, Java chooses which one to call, it is known as Method Overloading.
    public Box() {
    }

    public Box(int w, int h) {

    }

    public Box(int w, int h, String name) {

    }
}

class Circle extends Shapes {

    @Override
    void name() { // This is a Runtime Polymorphism / Dynamic Polymorphism.
//        It happens by method overriding.
//        super.name();
        System.out.println("It's a circle shape.");
    }
}

class Rectangle extends Shapes {
    void name() {
        System.out.println("It's a rectangle shape.");
    }
}

class Triangle extends Shapes {
    void name() {
        System.out.println("It's a triangle shape.");
    }
}