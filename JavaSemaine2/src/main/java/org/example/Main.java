package org.example;
import org.example.tpSemaine2.BankAccount;
import org.example.tpSemaine2.Couleur;
import org.example.tpSemaine2.Voiture;
import org.example.tpSemaine2.Moto;

import static org.example.tpSemaine2.Couleur.BLEU;
import static org.example.tpSemaine2.Couleur.JAUNE;

public class Main {
    public static void main(String[] args) {

//        BankAccount compte1 = new BankAccount(500, "Max");
//        System.out.println(compte1);
//        compte1.déposer();
//        compte1.retrait();

//        Voiture voiture1 = new Voiture();
//        Moto moto1 = new Moto();
//
//        voiture1.acclerer();
//        voiture1.ralentir();
//        voiture1.tournerGauche();
//        voiture1.tournerDroite();
//
//        moto1.acclerer();
//        moto1.ralentir();
//        moto1.tournerGauche();
//        moto1.tournerDroite();

        Couleur couleur1 = BLEU;
        Couleur couleur2 = JAUNE;
        System.out.println(couleur1);
        System.out.println(couleur2);

        if (couleur1 == Couleur.BLEU && couleur2 == Couleur.JAUNE){
            System.out.println("le mélange des deux couleurs est: VERT");
        } else if (couleur1== Couleur.BLEU && couleur2 == Couleur.ROUGE) {
            System.out.println("Le mélange des deux couleurs est: VIOLET");
        }

    }
}