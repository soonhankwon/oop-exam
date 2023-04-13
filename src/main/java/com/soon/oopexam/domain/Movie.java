package com.soon.oopexam.domain;

public class Movie {
    public static final int REGULAR = 1;
    public static final int NEW_RELEASE = 2;
    private int priceCode;

    public int getFrequentRenterPoints(int daysRented) {
        if(priceCode == NEW_RELEASE && daysRented > 1)
            return 2;
        else
            return 1;
    }
}
