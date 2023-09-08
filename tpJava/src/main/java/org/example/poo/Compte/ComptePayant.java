package org.example.poo.Compte;

public class ComptePayant extends Compte {

    int taux;

    public ComptePayant(double solde, int taux) {
        super(solde);
        this.taux = taux;
        this.code = code++;
    }

    public int getTaux() {
        return taux;
    }
    public void setTaux(int taux) {
        this.taux = taux;
    }

    public void debiterCompte(double montant) {
        if (solde < 0) {
            solde = (solde - montant) - solde * taux / 100;
            System.out.println("Le solde du compte après débit et prélèvement de la taxe: " + solde);
        }else {
            System.out.println("Fond insuffisant, votre solde : " + solde + " !  Retrait demandé :" + montant);
        }
    }

    @Override
    public void crediterCompte(double montant) {
        solde = (solde + montant - montant * taux / 100);
        System.out.println("Solde du compte après versement : " + solde);
    }

    @Override
    public String toString() {
        return super.toString() + "Taxe d'opération : " + taux;
    }
}
