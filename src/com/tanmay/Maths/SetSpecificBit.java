package com.tanmay.Maths;

public class SetSpecificBit {
    public static void main(String[] args) {
         int n = 10;
         setithbit(n, 3);

    }

    static void setithbit(int n, int i)
    {
        n = n | (1<<i-1);
    }
}
