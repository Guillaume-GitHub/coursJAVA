package com.openCl.guigui.HomeShop;

public class Client {
    String fullName;
    String adress;

    public Client(String fullName, String adress) {
        this.fullName = fullName;
        this.adress = adress;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAdress() {
        return adress;
    }
}
