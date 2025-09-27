package com.example.resourcerenting;

public class Resource {
    private String name, price, date, time, location, description;
    private String imageUri; // store image as string

    public Resource(String name, String price, String date, String time, String location, String description, String imageUri) {
        this.name = name;
        this.price = price;
        this.date = date;
        this.time = time;
        this.location = location;
        this.description = description;
        this.imageUri = imageUri;
    }

    public String getName() { return name; }
    public String getPrice() { return price; }
    public String getDate() { return date; }
    public String getTime() { return time; }
    public String getLocation() { return location; }
    public String getDescription() { return description; }
    public String getImageUri() { return imageUri; }
}
