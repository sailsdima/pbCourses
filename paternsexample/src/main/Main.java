package main;

import model.Customer;
import model.Movie;
import model.MovieType;
import model.Rental;
import model.filmType.ChildrenType;
import model.filmType.NewReleaseType;
import model.filmType.RegularType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Movie> movies = new ArrayList<>(Arrays.asList(
                new Movie("Titanic", new ChildrenType()),
                new Movie("Batman", new ChildrenType()),
                new Movie("Film1", new NewReleaseType()),
                new Movie("Film2", new NewReleaseType()),
                new Movie("Film3", new RegularType()),
                new Movie("Film4", new RegularType())
        ));

        Customer customer = new Customer("Sasha");
        customer.addRental(new Rental(movies.get(0), 2));
        customer.addRental( new Rental(movies.get(2), 2));
        customer.addRental( new Rental(movies.get(4), 20));
        System.out.println(customer.statement());

    }
}
