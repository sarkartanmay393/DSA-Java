package com.tanmay.OOP;

public class Singleton {
    public static void main(String[] args) {
        OneManPunch ImTheGod = OneManPunch.getInstance();
        ImTheGod.force = 1.0;
        System.out.println(ImTheGod.force);
        OneManPunch HeIsBeast = OneManPunch.getInstance();
        System.out.println(HeIsBeast.force);

    }
}

class OneManPunch { // one punch is enough to fuck you up.
    double force = 0.0;
    String feelings = "neutral";

    private OneManPunch() {
    }

    private static OneManPunch instance;

    public static OneManPunch getInstance() {
        if (instance == null) {
            instance = new OneManPunch();
        }
        return instance; // it will give same instance to everybody.
    }
}
