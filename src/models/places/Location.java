package models.places;

public class Location {
    String locationString;

    public Location() {

    }

    public Location(String locationString) {
        this();
        setLocationString(locationString);
    }

    public boolean isAirport() { return false; }

    public String getLocationString() { return locationString; }
    public Location setLocationString(String locationString) {
        this.locationString = locationString;
        return this;
    }

    @Override
    public String toString() {
        return getLocationString();
    }
}
