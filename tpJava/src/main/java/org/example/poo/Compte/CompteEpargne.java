package org.example.poo.Compte;

public class CompteEpargne extends Compte {

    int tauxInteret;

    public CompteEpargne(double solde, int tauxInteret) {
        super(solde);
        this.tauxInteret = tauxInteret;
    }

    public int getTauxInteret() {
        return tauxInteret;
    }
    public void setTauxInteret(int tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    public void calculInteret (){
        solde = solde + solde * tauxInteret / 100;
        System.out.println("Le nouveau solde après calcul des intérets est: " + solde);
    }

    @Override
    public void debiterCompte(double montant) {
        if (solde < 0) {
            super.debiterCompte(montant);
        }else {
            System.out.println("Fond insuffisant, votre solde : " + solde + " !  Retrait demandé :" + montant);
        }
    }
}
