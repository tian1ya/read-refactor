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

    public static int getCHILDLESS() {
        return CHILDLESS;
    }

    public static int getREGULAR() {
        return REGULAR;
    }

    public static int getNewRelease() {
        return NEW_RELEASE;
    }

    public String getTitle() {
        return _title;
    }

    public void set_title(String _title) {
        this._title = _title;
    }

    public Integer getPriceCode() {
        return _priceCode;
    }

    public void set_priceCode(Integer _priceCode) {
        this._priceCode = _priceCode;
    }
}
