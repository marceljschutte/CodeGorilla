package nl.codegorilla.CodeGorilla.model;

public class Location {
    private String country;
    private String city;

    public Location(String country, String city) {
        this.country = country;
        this.city = city;
    }

    public Location(String country) {
        this(country, "?");
    }

    public Location() {
        this("?", "?");
    }

    public Location(Location location) {
        this(location.country, location.city);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return country + " " + city;
    }
}
