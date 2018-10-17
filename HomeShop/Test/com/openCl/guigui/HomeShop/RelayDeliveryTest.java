package com.openCl.guigui.HomeShop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelayDeliveryTest {

    @Test
    public void GivenFreeRelay_WhenGettingDeliveryPrice_ThenGet0e(){
    RelayDelivery relayDelivery = new RelayDelivery(5);
    assertEquals(0.0, relayDelivery.getPrice(),0.01);
    }

    @Test
    public void GivenLowRelay_WhenGettingDeliveryPrice_ThenGet2e99(){
        RelayDelivery relayDelivery = new RelayDelivery(30);
        assertEquals(2.99, relayDelivery.getPrice(),0.01);
    }
    @Test
    public void GivenMaxRelay_WhenGettingDeliveryPrice_ThenGet4e99(){
        RelayDelivery relayDelivery = new RelayDelivery(50);
        assertEquals(4.99, relayDelivery.getPrice(),0.01);
    }

}