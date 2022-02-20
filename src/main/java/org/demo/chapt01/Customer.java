package org.demo.chapt01;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String _name) {
        this._name = _name;
    }

    public void addRental(Rental arg) {
        this._rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoint = 0;
        Enumeration rentals = this._rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();
            switch (each.getMovie().getPriceCode()) {
                case Movie.REGULAR:
                    thisAmount += 2;
                    if (each.getDaysRecord() > 2) {
                        thisAmount += (each.getDaysRecord() - 2) * 1.5;
                    }
                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += each.getDaysRecord() * 3;
                    break;
                case Movie.CHILDLESS:
                    thisAmount += 1.5;
                    if (each.getDaysRecord() > 3) {
                        thisAmount += (each.getDaysRecord() - 3) * 1.5;
                    }
                    break;
            }

            frequentRenterPoint++;
            if (each.getMovie().getPriceCode() == Movie.NEW_RELEASE && each.getDaysRecord() > 1) {
                frequentRenterPoint ++;
            }

            result += "\t" +each.getMovie().getTitle() + "\t" + thisAmount + "\n";
            totalAmount += thisAmount;
        }

        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoint + " frequent renter points";
        return result;
    }
}
