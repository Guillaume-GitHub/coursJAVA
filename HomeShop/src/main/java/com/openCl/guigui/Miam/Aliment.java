package com.openCl.guigui.Miam;

public class Aliment {
    String nom;
    boolean estCuit;



    public void manger(){
        if (estCuit)
            System.out.println("Cet aliment : " + nom + " est cuit");
        else
            System.out.println("Cet aliment : " + nom + " est cru");
    }
}
