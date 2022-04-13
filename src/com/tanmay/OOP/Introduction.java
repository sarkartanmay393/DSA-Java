package com.tanmay.OOP;

public class Introduction {
    public static void main(String[] args) {
        Satellite s1 = new Satellite();
        for (double i = 0; i < 315000; i++) {
            s1 = new Satellite();
        }
    }

}

class Satellite {
    String NAME;
    double speed;
    double elevation;

    Satellite(String name, double speed, double elevation) {
        this.NAME = name;
        this.speed = speed;
        this.elevation = elevation;
    }

    public Satellite() {

    } // for creating null valued Satellite.

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is deleted!");
        super.finalize();
    } // tracker when Java clears its garbage of Satellite object.
}

