package org.example.FindCarre;

import java.util.Scanner;

public class FindCarre {

    public static void getCarre(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre: ");
        Integer nombre = scanner.nextInt();
        Integer nbrCarre = nombre * nombre;
        System.out.println("Voici le carré de votre nombre: " + nbrCarre);
    }

}
