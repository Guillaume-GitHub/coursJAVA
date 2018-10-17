package com.openCl.guigui.Paris;

public class Bus implements MoyenDeLocomotion {
    @Override
    public void deplace(String adresse) {
        System.out.println("Je suis en Bus et je vais au : " + adresse);
    }
}
