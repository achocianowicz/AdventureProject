package com.example.joydr.adventure;

public class Item {
    private String name = null, description = null;
    private double buyPrice = -1, deprecationRate =-1, sellPrice =-1;

    public Item () {}

    public Item(String name, String description, double buyPrice, double deprecationRate, double sellPrice) {
        this.name = name;
        this.description = description;
        this.buyPrice = buyPrice;
        this.deprecationRate = deprecationRate;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getDeprecationRate() {
        return deprecationRate;
    }

    public void setDeprecationRate(double deprecationRate) {
        this.deprecationRate = deprecationRate;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }
}
