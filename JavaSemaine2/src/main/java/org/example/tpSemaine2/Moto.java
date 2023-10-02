package org.example.tpSemaine2;

public class Moto implements Vehicule{
    @Override
    public void acclerer() {
        System.out.println("La moto accélére");
    }

    @Override
    public void ralentir() {
        System.out.println("La moto ralenti");
    }

    @Override
    public void tournerGauche() {
        System.out.println("La moto tourne à gauche");
    }

    @Override
    public void tournerDroite() {
        System.out.println("La moto tourne à gauche");
    }
}
