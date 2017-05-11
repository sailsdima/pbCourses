package model.filmType;

import model.MovieType;
import model.Rental;

/**
 * Created by dima on 11.05.17.
 */
public class RegularType implements MovieType{

    @Override
    public double getPriceCode(Rental rental) {
        return 2 + (rental.getDaysRented() > 2 ? (rental.getDaysRented() - 2) * 1.5 : 0);
    }

    @Override
    public int getRentalFrequentPoints(Rental rental) {
        return 1;
    }
}
