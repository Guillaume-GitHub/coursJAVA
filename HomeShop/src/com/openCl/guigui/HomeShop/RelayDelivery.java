package com.openCl.guigui.HomeShop;

import com.openCl.guigui.HomeShop.Delivery;

public class RelayDelivery implements Delivery {

    private int relayNumber;

    public RelayDelivery(int relayNb) {
       this.relayNumber = relayNb;
    }

    @Override
    public double getPrice() {
        if (relayNumber >=1 && relayNumber <=22)
            return 0;
        else if (relayNumber >23 && relayNumber <=47)
            return 2.99;
        else
            return 4.99;
        }

    @Override
    public String getInfo() {
        return "Livraison en point relay";
    }
}
