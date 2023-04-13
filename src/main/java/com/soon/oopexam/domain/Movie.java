package com.soon.oopexam.domain;

public class Movie {
    public static final int REGULAR = 1;
    public static final int NEW_RELEASE = 2;
    private int priceCode;

    public boolean isPriceCodeNewRelease() {
        return this.priceCode == NEW_RELEASE;
    }

    public int getDaysRentedByPriceCode(int daysRented) {
        if(isPriceCodeNewRelease() && daysRented > 1)
            return 2;
        else
            return 1;
    }
}
