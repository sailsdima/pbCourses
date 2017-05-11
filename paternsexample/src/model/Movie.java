package model;


public class Movie {
    private String title;
    private MovieType movieType;

    public Movie(String title, MovieType priceCode) {
        this.title = title;
        this.movieType = priceCode;
    }

    public MovieType getMovieType() {
        return movieType;
    }

    public void setMovieType(MovieType movieType) {
        this.movieType = movieType;
    }

    public String getTitle() {
        return title;
    }

    public double getAmount(Rental rental){
        return movieType.getPriceCode(rental);
    }

    public int getRentalFrequentPoints(Rental rental){
        return movieType.getRentalFrequentPoints(rental);
    }
}
