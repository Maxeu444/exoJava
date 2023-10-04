package org.example.hotelTp;

public class Chambre {

    private static int count;
    private int numeroChambre;
    private boolean isAvailable;
    private int nombreLits;
    private double prix;

    {
        ++count;
    }

    public Chambre(int nombreLits, double prix) {
        this.nombreLits = nombreLits;
        this.prix = prix;
        this.numeroChambre = count;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Chambre.count = count;
    }

    public int getNumeroChambre() {
        return numeroChambre;
    }

    public void setNumeroChambre(int numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getNombreLits() {
        return nombreLits;
    }

    public void setNombreLits(int nombreLits) {
        this.nombreLits = nombreLits;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
