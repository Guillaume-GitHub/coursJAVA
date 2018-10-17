package com.openCl.guigui.HomeShop;

import java.util.Map;

public class Bill {
    private Client customer;
    private Map<Product,Integer> products;
    private Delivery delivery;

    public Bill(Client client,Delivery delivery){
        this.customer = client;
        this.delivery = delivery;
    }

    /**
     * Add product with quantity to a bill
     * @param product product to add
     * @param quantity the quantity of the product
     */
    public void addProduct(Product product, Integer quantity){
        this.products.put(product,quantity);
    }

    public Client getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void generate(Writer writer) {
        writer.start();
        writer.writeLine("HomeShop compagnie");
        writer.writeLine("1 Place Charles de Gaulle, 75008 Paris");
        writer.writeLine("");
        writer.writeLine("Facture à l'attention de : ");
        writer.writeLine(customer.getFullName());
        writer.writeLine(customer.getAdress());
        writer.writeLine("");
        writer.writeLine("Mode de livraison : " + delivery.getInfo());
        writer.writeLine("");
        writer.writeLine("Produits : ");
        writer.writeLine("-----------------------------------------------------");
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product product = entry.getKey();
            Integer quantity = entry.getValue();
            writer.writeLine(product.getName() + " - " + product.getPrice() + " - " + quantity + " unité(s)");
            writer.writeLine(product.getDescription());
            writer.writeLine("");
        }
        writer.writeLine("Livraison : " + delivery.getPrice());
        writer.writeLine("-----------------------------------------------------");
        writer.writeLine("Total : " + this.getTotal());
        writer.stop();
    }

    /**
     * get the total price for the current bill, including products and delivery cost
     * @return total price
     */
    public double getTotal() {
        double total = delivery.getPrice();
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product product = entry.getKey();
            Integer quantity = entry.getValue();
            total += product.getPrice() * quantity;
        }
        return total;
    }
}
