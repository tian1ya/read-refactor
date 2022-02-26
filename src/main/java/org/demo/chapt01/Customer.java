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
        Enumeration rentals = this._rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += "\t" + each.getMovie().getTitle() + "\t" + each._movie.price.getCharge(each.getDaysRecord()) + "\n";
        }

        result += "Amount owed is " + getTotalCharge() + "\n";
        result += "You earned " + getTotalRenterPointers() + " frequent renter points";
        return result;
    }

    public String htmlStatement() {
        Enumeration rentals = this._rentals.elements();
        String result = "<H1>Rental Record for <EM>" + getName() + "</EM></H1><P>\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getMovie().getTitle() + ": " + each._movie.price.getCharge(each.getDaysRecord()) + "<BR>\n";
        }

        result += "<P>You owned <EM>Amount owed is " + getTotalCharge() + "</EM><P>\n";
        result += "On this you earned <EM>" + getTotalRenterPointers() + "</EM> frequent renter points<P>";
        return result;
    }

    public double getTotalCharge() {
        Double result = 0.0;
        Enumeration rentals = this._rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getMovie().price.getCharge(each.getDaysRecord());
        }
        return result;
    }

    public double getTotalRenterPointers() {
        Double result = 0.0;
        Enumeration rentals = this._rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each._movie.price.getFrequentRenterPoints(each.getDaysRecord());
        }
        return result;
    }

}
