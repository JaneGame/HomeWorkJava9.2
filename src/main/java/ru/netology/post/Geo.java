package ru.netology.post;

public class Geo {
    private String type;
    private String coordinate;

    public String getType() {
        return type;
    }

    public Geo setType(String type) {
        this.type = type;
        return this;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public Geo setCoordinate(String coordinate) {
        this.coordinate = coordinate;
        return this;
    }
}
