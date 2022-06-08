package com.tanmay.OOP;

public class Wildcard {
    public static void main(String[] args) {

        CurrGen<Integer> cg = new CurrGen<>(1947, 2022);
        System.out.println(cg.Calculate());

        // CurrGen<String> cg1 = new CurrGen<String>("1947", "2022");
        // We can't make cg1 String, because it's explicitly we told to
        // only accept Objects that extends to Number.

    }
}

interface Generation {
    Object Calculate();
}

class CurrGen<T extends Number> implements Generation {
    Object start = null;
    Object end = null;

    public CurrGen(Object s, Object e) {
        this.start = s;
        this.end = e;
    }

    void mergeGens(CurrGen<? extends Number> cg) {
        // it only takes Number objects.
    }

    @Override
    public Object Calculate() {
        return (Integer) end - (Integer) start;
    }
}
