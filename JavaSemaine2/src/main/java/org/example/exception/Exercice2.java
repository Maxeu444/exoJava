package org.example.exception;

import java.util.Scanner;

public class Exercice2 {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la chaine de charactère à convertir : ");
        String chaine = scanner.next();

        try {
            int i = Integer.valueOf(chaine).intValue();
            System.out.println("Votre entier est: " + i);
        } catch (Exception e) {
            throw new Exception("Cette chaine ne représente pas un entier");
        }
    }
}
