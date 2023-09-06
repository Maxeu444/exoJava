package org.example.somme;

import java.util.Scanner;

public class Somme {

    public static void getSomme(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre :");
        Integer number = scanner.nextInt();
        int temp= 1;
        Integer somme = 1;

        while  (temp<number-1) {
            somme = somme + (somme+1);
            temp++;
        }
        System.out.println(somme);
    }
}
