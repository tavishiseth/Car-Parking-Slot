package com.sheryians.major.model;

public enum VehicleTypePrice {
    SMALL(100),
    MEDIUM(200),
    LARGE(300);

    private int price;

    VehicleTypePrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
    public String toString() {
        return this.name();
    }
}
