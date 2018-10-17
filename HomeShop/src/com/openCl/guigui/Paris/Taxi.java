package com.openCl.guigui.Paris;

public class Taxi implements MoyenDeLocomotion {
    @Override
    public void deplace(String adresse) {
        System.out.println("Je suis en Taxi et je vais au : " + adresse);
    }
}
