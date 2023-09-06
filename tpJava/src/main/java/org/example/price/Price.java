package org.example.price;

import java.util.Scanner;

public class Price {

    public static void  getPrice(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Entres le prix HORS-TAXE de l'article:");
        Integer prixHt = scanner.nextInt();
        System.out.println("Combien d'article ?");
        Integer nbrArticle = scanner.nextInt();
        System.out.println("Entrez le taux de TVA (en %): ");
        Integer tva = scanner.nextInt();
        Integer prixTtc = (prixHt + (prixHt * tva/100)) * nbrArticle;

        System.out.println("Le prix TTC est de " + prixTtc);

    }


}
