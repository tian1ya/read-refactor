package org.demo.chapt01;

public class Movie {
    public static final int CHILDLESS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    public String _title;
    public Integer _priceCode;

    public Movie(String _title, Integer _priceCode) {
        this._title = _title;
        this._priceCode = _priceCode;
    }

    public String getTitle() {
        return _title;
    }

    public void setTitle(String _title) {
        this._title = _title;
    }

    public Integer getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(Integer _priceCode) {
        this._priceCode = _priceCode;
    }

    double getCharge(int daysRecord) {
        double thisAmount = 0;
        switch (getPriceCode()) {
            case REGULAR:
                thisAmount += 2;
                if (daysRecord > 2) {
                    thisAmount += (daysRecord - 2) * 1.5;
                }
                break;
            case NEW_RELEASE:
                thisAmount += daysRecord * 3;
                break;
            case CHILDLESS:
                thisAmount += 1.5;
                if (daysRecord > 3) {
                    thisAmount += (daysRecord - 3) * 1.5;
                }
                break;
        }
        return thisAmount;
    }

    int getFrequentRenterPoints(int daysRecord) {
        if (getPriceCode() == NEW_RELEASE && daysRecord > 1) {
            return 2;
        }
        return 1;
    }
}
