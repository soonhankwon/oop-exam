package com.soon.oopexam;

import com.soon.oopexam.domain.Movie;
import com.soon.oopexam.domain.NewReleaseMovie;
import com.soon.oopexam.domain.RegularMovie;
import com.soon.oopexam.domain.Rental;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RentalTest {
    @Test
    void test() {
        Movie movie = new NewReleaseMovie();
        int daysRented = 2;
        Movie movie1 = new RegularMovie();

        Rental rental1 = new Rental(movie, daysRented);
        Rental rental2 = new Rental(movie1, daysRented);

        Assertions.assertThat(rental1.getFrequentRenterPoints()).isEqualTo(2);
        Assertions.assertThat(rental2.getFrequentRenterPoints()).isEqualTo(1);
    }
}
