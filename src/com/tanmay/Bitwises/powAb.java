package com.tanmay.Bitwises;

public class powAb {
    public static void main(String[] args) {

        int base = 3;
        int power = 6; // pow(base,power);

        int ans = 1;

        while(power > 0){
            if((power & 1) == 1){
                ans *= base;
            }
            base *= base;
            power >>= 1;
        }

        System.out.println(ans);
    }
}
