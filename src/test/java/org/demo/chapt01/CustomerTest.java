package org.demo.chapt01;

import junit.framework.TestCase;
import org.junit.Test;

public class CustomerTest extends TestCase {

    @Test
    public void testRentalStatement() {
        Customer customer = new Customer("Marry");

        Movie movie = new Movie("01", 1);
        Rental rental = new Rental(movie, 1);

        Movie movie1 = new Movie("02", 2);
        Rental rental1 = new Rental(movie1, 1);
        customer.addRental(rental1);


        Movie movie2 = new Movie("03", 0);
        Rental rental2 = new Rental(movie2, 1);
        customer.addRental(rental2);


        Movie movie3 = new Movie("04", 1);
        Rental rental3 = new Rental(movie3, 2);
        customer.addRental(rental3);

        System.out.println(customer.statement());
        System.out.println("\n\n");
        System.out.println(customer.htmlStatement());
    }


}