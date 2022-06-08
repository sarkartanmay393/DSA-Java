package com.tanmay.OOP;

import java.util.Arrays;

public class Generics {
    public static void main(String[] args) {
        CustomList<String> cAL = new CustomList();
        for (int i=1; i<=11; i++) {cAL.add("DS");}
        cAL.remove();
        System.out.println(cAL);



    }
}

// Creating a custom arraylist like object.
class CustomArrayList {
    private static int DEFAULT_SIZE = 10;
    private int[] arr;
    private int size = 0;

    private boolean isFull() {
        return arr.length == size;
    }

    private void resize() {
        int[] tmp = new int[arr.length * 2];
        for (int i=0; i<arr.length; i++) {
            tmp[i] = arr[i];
        }
        arr = tmp;
    }

    void add(int value) {
        if (isFull()) {
            resize();
        }
        arr[size++] = value;
    }

    void remove() {
        arr[--size] = 0;
    }

    int get(int index) {
        return arr[index];
    }

    int size() {
        return arr.length;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }

    public CustomArrayList() {
        arr = new int[DEFAULT_SIZE];
    }
}



// Advance custom arraylist with Generics support.
class CustomList<T> {
    private static int DEFAULT_SIZE = 10;
    private Object[] arr;
    private int size = 0;

    private boolean isFull() {
        return arr.length == size;
    }

    private void resize() {
        Object[] tmp = new Object[arr.length * 2];
        for (int i=0; i<arr.length; i++) {
            tmp[i] = arr[i];
        }
        arr = (T[]) tmp;
    }

    void add(T value) {
        if (isFull()) {
            resize();
        }
        arr[size++] = value;
    }

    void remove() {
        arr[--size] = null;
    }

    T get(int index) {
        return (T)arr[index];
    }

    int size() {
        return arr.length;
    }

    @Override
    public String toString() {
        return "CustomList{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }

    public CustomList() {
        this.arr = new Object[DEFAULT_SIZE];
    }
}


