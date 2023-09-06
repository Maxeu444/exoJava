package org.example.findNegPos;

import java.util.Scanner;

public class PosiNega {


    public static void findPolarite(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre :");
        Integer number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Votre nombre est positif");
        } else if (number < 0){
            System.out.println("Votre nombre est négatif");
        } else {
            System.out.println("Votre nombre est zéro, recommencez");
        }


    }

}
