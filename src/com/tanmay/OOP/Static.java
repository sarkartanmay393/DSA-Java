package com.tanmay.OOP;

public class Static {
    public static void main(String[] args) {
        // helper.innerHelper asdfasd = new helper.innerHelper(3);
        // helper asdfasd = new helper();
        System.out.println('&' - 0);
    }
}

class helper {
    static int a;

    static void test(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
    }


    // this is the static block.
    static {
        System.out.println("Initialised");
        a = 5;
    }
    // this is the static block.

    static class innerHelper {
        int a;

        public innerHelper(int x) {
            this.a = x;
        }
    }

}
