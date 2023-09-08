package org.example.poo.Compte;

abstract class Compte {

    protected int code = 1;
    protected double solde = 0F;

    public Compte(double solde) {
        this.solde = solde;
    }

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void crediterCompte(double montant){
        solde = solde + montant;
        System.out.println("Solde du compte après versement : " + solde);
    }

    public void debiterCompte(double montant){
        solde = solde - montant;
        System.out.println("Le solde du compte après débit : " + solde);
    }

    @Override
    public String toString() {
        return "Compte n°" + code +
                " Solde: " + solde;
    }
}
