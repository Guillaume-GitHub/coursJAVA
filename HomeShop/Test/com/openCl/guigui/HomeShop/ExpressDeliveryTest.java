package com.openCl.guigui.HomeShop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressDeliveryTest {
    @Test
    public void GivenCityLocation_WhenGettingDeliveryPrice_ThenGet6e99(){
        ExpressDelivery expressDelivery = new ExpressDelivery("Paris");
        assertEquals(6.99,expressDelivery.getPrice(),0.01);
    }

    @Test
    public void GivenCityLocation_WhenGettingDeliveryPrice_ThenGet9e99(){
        ExpressDelivery expressDelivery = new ExpressDelivery("Bordeaux");
        assertEquals(9.99,expressDelivery.getPrice(),0.01);
    }

}