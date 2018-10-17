package com.openCl.guigui.HomeShop;

public class Product {
    String name;
    String description;
    double price;

    /**
     * Display the full description of the product
     */
    public void look(){

    }

    /**
     * Add the product to a bill
     * @param bill concerned bill
     * @param quantity  the quantity to add
     */
    public  void buy(Bill bill, Integer quantity){

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
