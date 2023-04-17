package com.soon.oopexam.domain;

public class NewReleaseMovie implements Movie{
    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}
