package com.openCl.guigui;

import com.openCl.guigui.Garage.Bike;
import com.openCl.guigui.Garage.Vehicle;
import com.openCl.guigui.HomeShop.*;
import com.openCl.guigui.Miam.Aliment;
import com.openCl.guigui.Paris.Bus;
import com.openCl.guigui.Paris.Parisien;
import com.openCl.guigui.Paris.Taxi;

import java.util.List;

public class Main {

    public static void main(String[] args) {
/*
        Product cafe = new Product("Philips HD7866/61", "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses", 79.99);
        Television tv = new Television("TV Samsung UE49MU6292", "Smart TV LED incurvée 49\"", 599, 49, "LED");
        Fridge fridge = new Fridge("BEKO TSE 1042 F", "Réfrigérateur BEKO 130L - Classe A+ - blanc", 189, 130, false);

        Client customer = new Client("Juste Leblanc", "19 rue Germain Pilon, Paris");

        Bill bill = new Bill(customer);
        bill.addProduct(cafe, 1);
        bill.addProduct(tv, 1);
        bill.addProduct(fridge, 1);

        Vehicle v = new Bike();
*/

        Parisien paul = new Parisien();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        paul.seDeplacer(bus);
        paul.seDeplacer(taxi);
    }
}
