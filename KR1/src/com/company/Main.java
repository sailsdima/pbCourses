package com.company;

public class Main {

    public static void main(String[] args) {
        Series series = new Series();
        series.sort();
        series.printAllObjectsInfo();
        System.out.println("\n\nAll numbers (sorted)");
        series.printIntoFile();

        series.readFromFile();
        series.sortReverseOrder();
        System.out.println("\n\nNumbers read from file (sorted in reversed order)");
        series.printAllObjectsInfo();
    }
}
