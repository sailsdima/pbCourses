package model;

/**
 * Created by dima on 05.05.17.
 */
public interface MovieType {
    double getPriceCode(Rental rental);
    int getRentalFrequentPoints(Rental rental);
}
