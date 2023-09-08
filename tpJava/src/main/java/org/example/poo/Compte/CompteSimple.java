package org.example.poo.Compte;

public class CompteSimple extends Compte {

    double decouvert = 500F;

    public CompteSimple(double solde) {
        super(solde);
    }


    public double getDecouvert() {
        return decouvert;
    }
    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }

    @Override
    public void debiterCompte(double montant) {
       if (solde > decouvert) {
           super.debiterCompte(montant);
       }else {
           System.out.println("Retrait impossible, découvert atteint (-500 euro) !");
       }
    }
}
