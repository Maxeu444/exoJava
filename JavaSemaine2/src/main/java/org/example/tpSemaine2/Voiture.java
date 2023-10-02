package org.example.tpSemaine2;

public class Voiture implements Vehicule {

    @Override
    public void acclerer() {
        System.out.println("La voiture accélére");
    }

    @Override
    public void ralentir() {
        System.out.println("La voiture ralenti");
    }

    @Override
    public void tournerGauche() {
        System.out.println("La voiture tourne à gauche");
    }

    @Override
    public void tournerDroite() {
        System.out.println("La voiture tourne à droite");
    }
}
