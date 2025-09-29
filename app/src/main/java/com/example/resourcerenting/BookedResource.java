package com.example.resourcerenting;

public class BookedResource {
    private String name, date, time, location, price, description;

    public BookedResource(String name, String date, String time, String location, String price, String description) {
        this.name = name;
        this.date = date;
        this.time = time;
        this.location = location;
        this.price = price;
        this.description = description;
    }

    public String getName() { return name; }
    public String getDate() { return date; }
    public String getTime() { return time; }
    public String getLocation() { return location; }
    public String getPrice() { return price; }
    public String getDescription() { return description; }
}
