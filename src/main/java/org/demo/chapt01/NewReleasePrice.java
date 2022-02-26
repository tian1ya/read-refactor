package org.demo.chapt01;

public class NewReleasePrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    double getCharge(int daysRecord) {
        return daysRecord * 3;
    }

    @Override
    int getFrequentRenterPoints(int daysRecord) {
        return (daysRecord > 1) ? 2 : 1;
    }
}
