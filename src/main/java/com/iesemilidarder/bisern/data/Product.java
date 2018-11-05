package com.iesemilidarder.bisern.data;

import java.nio.DoubleBuffer;

public abstract class Product {
    private String name;
    private Double price;
    private String numPeople;
    private String place;


    private ProductType productType;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }

    public String getNumPeople() {
        return numPeople;
    }
    public void setNumPeople(String numPeople) {
        this.numPeople = numPeople;
    }

    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }
}
