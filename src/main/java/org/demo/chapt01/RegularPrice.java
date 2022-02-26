package org.demo.chapt01;

public class RegularPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    double getCharge(int daysRecord) {
        return daysRecord > 2 ? (daysRecord - 2) * 1.5 + 2 : 2;
    }

    @Override
    int getFrequentRenterPoints(int daysRecord) {
        return 1;
    }
}
