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
            result += "\t" + each.getMovie().getTitle() + "\t" + each.getCharge() + "\n";
        }

        result += "Amount owed is " + getTotalAmount() + "\n";
        result += "You earned " + getTotalRenterPointers() + " frequent renter points";
        return result;
    }

    public String htmlStatement() {
        Enumeration rentals = this._rentals.elements();
        String result = "<H1>Rental Record for <EM>" + getName() + "</EM></H1><P>\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getMovie().getTitle() + ": " + each.getCharge() + "<BR>\n";
        }

        result += "<P>You owned <EM>Amount owed is " + getTotalAmount() + "</EM><P>\n";
        result += "On this you earned <EM>" + getTotalRenterPointers() + "</EM> frequent renter points<P>";
        return result;
    }

    public double getTotalAmount() {
        Double result = 0.0;
        Enumeration rentals = this._rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    public double getTotalRenterPointers() {
        Double result = 0.0;
        Enumeration rentals = this._rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }

}
