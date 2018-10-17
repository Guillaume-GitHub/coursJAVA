package com.openCl.guigui.HomeShop;

import java.util.Map;

public class Bill {
    private Client customer;
    private Map<Product,Integer> products;

    public Bill(Client client){
        this.customer = client;
    }

    /**
     * Add product with quantity to a bill
     * @param product product to add
     * @param quantity the quantity of the product
     */
    public void addproduct(Product product, Integer quantity){
        this.products.put(product,quantity);

    }

    public String getCustomer() {
        return customer;
    }

    public Map<String, Integer> getProduct() {
        return products;
    }
}
