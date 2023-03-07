package com.phone;

import com.phone.part.CPU;

public class Phone {
    CPU cpu;
    String type;

    static {
        PRICE = 4.90f;
        DISCOUNT_PRICE = 9.80f;
//        System.out.println(DISCOUNT_PRICE);
    }

    public static float PRICE;
    public static float DISCOUNT_PRICE;

    static {
        System.out.println(DISCOUNT_PRICE);
        DISCOUNT_PRICE = 4.90f;
        System.out.println(DISCOUNT_PRICE);
    }
}
