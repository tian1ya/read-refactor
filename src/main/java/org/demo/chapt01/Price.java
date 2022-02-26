package org.demo.chapt01;

abstract class Price {
    abstract int getPriceCode();
    abstract double getCharge(int daysRecord);
    abstract int getFrequentRenterPoints(int daysRecord);
}
