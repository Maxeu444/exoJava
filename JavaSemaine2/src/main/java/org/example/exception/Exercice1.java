package org.example.exception;
import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le premier entier : ");
        int num1 = scanner.nextInt();
        System.out.println("Entrez le seconde entier : ");
        int num2 = scanner.nextInt();

        try {
            if (num2==0){
                throw new ArithmeticException("Division par zéro non autorisée !");
            }
            double resultat = (double) num1 / num2;
            System.out.println("Résultat : " + resultat);
        } catch (ArithmeticException e) {
            System.err.println("Erreur : " + e.getMessage());
        }
    }
}
