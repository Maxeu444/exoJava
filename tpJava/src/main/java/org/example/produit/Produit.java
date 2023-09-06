package org.example.produit;

import java.util.Scanner;

public class Produit {


    public static void getProduit(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer un 1er nombre");
        Integer firstNbr = scanner.nextInt();
        System.out.println("Veuillez entrer un 2nd nombre");
        Integer secondNbr = scanner.nextInt();

        if (firstNbr > 0 && secondNbr < 0 ){
            System.out.println("Le produit de vos nombres est négatif");
        } else if (firstNbr < 0 && secondNbr > 0){
            System.out.println("Le produit de vos nombres est négatif");
        } else {
            System.out.println("le produit est positif");
        }
    }
}
