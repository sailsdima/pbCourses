package model;

import java.util.*;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer (String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName () {
        return name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;

        StringBuilder result = new StringBuilder();

        result.append("<hmtl>\n<head>Учет аренды для " + getName() + "</head>\n");
        result.append("<body>\n");
        for (Rental rental: rentals) {
            double thisAmount = rental.getMovie().getAmount(rental);
            frequentRenterPoints += rental.getMovie().getRentalFrequentPoints(rental);

            //показать результаты для этой аренды
            result.append("\t" + rental.getMovie().getTitle()+ "\t<b>" +
                    String.valueOf(thisAmount) + "</b>\n");
            totalAmount += thisAmount;
        }
        //добавить нижний колонтитул
        result.append("\tСумма задолженности составляет <b>" +
                String.valueOf(totalAmount) + "</b>\n");
        result.append("\tВы заработали <b>" + String.valueOf(frequentRenterPoints) +
                "</b> очков за активность");
        result.append("\n</body>\n</html>");
        return result.toString();
    }
}
