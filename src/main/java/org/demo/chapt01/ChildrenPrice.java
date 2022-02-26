package org.demo.chapt01;

public class ChildrenPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.CHILDLESS;
    }

    @Override
    double getCharge(int daysRecord) {
        return daysRecord > 3 ? (daysRecord - 3) * 1.5 + 1.5 : 1.5;
    }

    @Override
    int getFrequentRenterPoints(int daysRecord) {
        return 1;
    }
}
