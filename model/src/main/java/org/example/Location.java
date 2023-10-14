package org.example;

public class Location {
    private String country;
    private String city;
    private String street;
    private String house;
    private Integer workshopId;

    public Location() {
    }

    public Location(String country, String city, String street, String house, Integer workshopId) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.workshopId = workshopId;
    }


    public Location withCountry(String country) {
        return new Location(country, city, street, house, workshopId);
    }

    public Location withCity(String city) {
        return new Location(country, city, street, house, workshopId);
    }

    public Location withStreet(String street) {
        return new Location(country, city, street, house, workshopId);
    }

    public Location withHouse(String house) {
        return new Location(country, city, street, house, workshopId);
    }

    public Location withWorkshopId(Integer workshopId) {
        return new Location(country, city, street, house, workshopId);
    }


    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    public Integer getWorkshopId() {
        return workshopId;
    }

    @Override
    public String toString() {
        return "Location{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", workshopId=" + workshopId +
                '}';
    }
}
