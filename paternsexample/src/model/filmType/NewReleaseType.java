package model.filmType;

import model.MovieType;
import model.Rental;

/**
 * Created by dima on 11.05.17.
 */
public class NewReleaseType implements MovieType{
    @Override
    public double getPriceCode(Rental rental) {
        return rental.getDaysRented() * 3;
    }

    @Override
    public int getRentalFrequentPoints(Rental rental) {
        return 1;
    }
}
