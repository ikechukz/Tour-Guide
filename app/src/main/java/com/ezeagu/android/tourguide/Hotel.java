package com.ezeagu.android.tourguide;

public class Hotel {
    private int hotelName;
    private int hotelAddress;
    private int phoneNumber;
    private int rating;

    public Hotel(int hotelName, int hotelAddress, int phoneNumber, int rating) {
        this.hotelName = hotelName;
        this.hotelAddress = hotelAddress;
        this.phoneNumber = phoneNumber;
        this.rating = rating;
    }

    public int getHotelName() {
        return hotelName;
    }

    public int getHotelAddress() {
        return hotelAddress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getRating(){
        return rating;
    }
}
