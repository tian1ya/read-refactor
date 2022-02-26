package org.demo.chapt01;

public class Movie {
    public static final int CHILDLESS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    public String _title;
    public Price price;

    public Movie(String _title, Integer price) {
        this._title = _title;
        setPriceCode(price);
    }

    public String getTitle() {
        return _title;
    }

    public void setTitle(String _title) {
        this._title = _title;
    }

    public Integer getPriceCode() {
        return price.getPriceCode();
    }

    public void setPriceCode(Integer _priceCode) {
        switch (_priceCode) {
            case CHILDLESS:
                price = new ChildrenPrice();
                break;
            case REGULAR:
                price = new RegularPrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

}
