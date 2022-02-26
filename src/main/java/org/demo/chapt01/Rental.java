package org.demo.chapt01;

public class Rental {
    private Movie _movie;
    private int _daysRecord;

    public Rental(Movie _movie, int _daysRecord) {
        this._movie = _movie;
        this._daysRecord = _daysRecord;
    }

    public Movie getMovie() {
        return _movie;
    }

    public void setMovie(Movie _movie) {
        this._movie = _movie;
    }

    public int getDaysRecord() {
        return _daysRecord;
    }

    public void setDaysRecord(int _daysRecord) {
        this._daysRecord = _daysRecord;
    }

    double getCharge() {
        double thisAmount = 0;
        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR:
                thisAmount += 2;
                if (getDaysRecord() > 2) {
                    thisAmount += (getDaysRecord() - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                thisAmount += getDaysRecord() * 3;
                break;
            case Movie.CHILDLESS:
                thisAmount += 1.5;
                if (getDaysRecord() > 3) {
                    thisAmount += (getDaysRecord() - 3) * 1.5;
                }
                break;
        }
        return thisAmount;
    }
}
