package com.soon.oopexam.domain;

public class RegularMovie implements Movie{
    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
