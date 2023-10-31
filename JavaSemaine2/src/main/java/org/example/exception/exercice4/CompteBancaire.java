package org.example.exception.exercice4;

public class CompteBancaire {

    private double solde;

    public CompteBancaire(double solde) {
        this.solde = solde;
    }

    public void retirerArgent(double montant){
        if (montant>solde){
            // TODO lever mon erreur personalisé
        } else {
            solde -=montant;
        }
    }

    public double getSolde(){
        return solde;
    }
}
