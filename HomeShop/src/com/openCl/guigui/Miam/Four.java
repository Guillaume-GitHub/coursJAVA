package com.openCl.guigui.Miam;

public class Four {
    int capacite;
    int puissance;

    protected Resistance resistance;
    private Soufflerie soufflerie;

    public void cuire(Aliment aliment){
        System.out.println("Je suis un aliment :" + aliment.nom);
        System.out.println("avec ma capacité de " + capacite + " litres");
        System.out.println("et ma puissance de " + puissance + " degrés.");
        aliment.estCuit = true;

    }
}
