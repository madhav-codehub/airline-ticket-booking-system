package com.codehub.enums;

public enum City {

    MUMBAI(Country.INDIA),
    DELHI(Country.INDIA),

    DALLAS(Country.USA),
    TEXAS(Country.USA),

    LONDON(Country.UK),
    LEEDS(Country.UK);

    private Country country;

    City(Country country) {
        this.country = country;
    }
}
