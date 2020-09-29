package com.example.cleaneats;

public class Restaurant {

    private String restaurantName;
    private String restaurantAddress;
    private int inspectionScore;

    public Restaurant(String restaurantName, String restaurantAddress, int inspectionScore) {
        this.restaurantName = restaurantName;
        this.restaurantAddress = restaurantAddress;
        this.inspectionScore = inspectionScore;
    }

    public int getInspectionScore() {
        return inspectionScore;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

}
