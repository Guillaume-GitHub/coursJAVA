package com.openCl.guigui.HomeShop;

import com.openCl.guigui.HomeShop.Delivery;

public class TakeAwayDelivery implements Delivery {
    @Override
    public double getPrice() {
        return 4.99;
    }

    @Override
    public String getInfo() {
        return "Retrait en magasin";
    }
}
