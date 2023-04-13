package com.soon.oopexam.domain;

public class Rental {
    private Movie movie;
    private int daysRented;

    public int getFrequentRenterPoints() {
        return movie.getFrequentRenterPoints(this.daysRented);
    }
}
