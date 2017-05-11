package model.filmType;

import model.MovieType;
import model.Rental;

/**
 * Created by dima on 10.05.17.
 */
public class ChildrenType implements MovieType {
    @Override
    public double getPriceCode(Rental rental) {
        return 1.5 + (rental.getDaysRented() > 3 ? (rental.getDaysRented() - 3) * 1.5 : 0);
    }

    @Override
    public int getRentalFrequentPoints(Rental rental) {
        return 1;
    }
}
