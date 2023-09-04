package org.example;

public record RealEstate(String address, int numberOfRooms, double price) {

    public RealEstate withPrice(double price) {
        return new RealEstate(this.address, this.numberOfRooms, price);
    }
}