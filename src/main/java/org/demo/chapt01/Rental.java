package org.demo.chapt01;

public class Rental {
    Movie _movie;
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

}
