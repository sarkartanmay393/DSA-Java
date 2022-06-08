package com.tanmay.OOP;

public class Abstract {
    public static void main(String[] args) {
        Mythology hinduism = new Hindu();
        System.out.println(hinduism.toStr());
    }


}

abstract class Mythology {
    // Holds the structure and important components,
    // that are being used for different mythologies.
    abstract String name();
    abstract String defination();
    abstract String supreme();
    abstract void createdOn(int a);

    String toStr() {
        // this will be at all mytho subclasses.
        return name() + defination();
    }
}

class Hindu extends Mythology{

    @Override
    String name() {
        return "Hinduism";
    }

    @Override
    String defination() {
        return null;
    }

    @Override
    String supreme() {
        return null;
    }

    @Override
    void createdOn(int a) {

    }
}

