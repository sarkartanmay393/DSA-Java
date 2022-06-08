package com.tanmay.OOP;

public class Interfaces {
    public static void main(String[] args) {

    }
}

interface engine {
    void start();
    void stop();
    void accelerate();
}

interface media {
    void playMusic();
    void pauseMusic();
    void next();
    void previous();

}


class ElectricCar implements engine, media {

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void accelerate() {

    }

    @Override
    public void playMusic() {

    }

    @Override
    public void pauseMusic() {

    }

    @Override
    public void next() {

    }

    @Override
    public void previous() {

    }
}
