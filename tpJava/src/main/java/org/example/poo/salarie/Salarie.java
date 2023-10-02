package org.example.poo.salarie;

public class Salarie {

    String matricule;
    String categorie;
    String service;
    String nom;
    int salaire;

    public Salarie(String nom, int salaire) {
        this.nom = nom;
        this.salaire = salaire;
    }

    public void AfficherSalaire(){
        System.out.println("Le salaire de " + nom + " est de " + salaire);
    }


}
