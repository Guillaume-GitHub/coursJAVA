package com.openCl.guigui.Miam;

public class Main {
    public static void main(String[] args) {
/*
        Four petitFour = new Four();
        petitFour.capacite = 50;
        petitFour.puissance  = 60;

        Four grandFour = new Four();
        grandFour.capacite = 100;
        grandFour.puissance = 220;

        Aliment cake = new Aliment();
        cake.nom = "Cake";
        cake.estCuit = false;
        cake.manger();

        petitFour.cuire(cake);
        System.out.println("");
        grandFour.cuire(cake);
        cake.manger();
*/

        Four four = new Four();
        four.cuire(30, 15);
    }
}
