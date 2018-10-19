package com.openCl.guigui.HomeShop;

import com.openCl.guigui.HomeShop.Delivery;

public class DirectDelivery implements Delivery {

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getInfo() {
        return "Livraison à Domicile";
    }
}
