package org.example.exception;

public class Exercice3 {
        public static void main(String[] args) {

            int[] tableau = new int[5];

            try {
                int sixiemeElement = tableau[5];
                System.out.println("La valeur du sixième élément est : " + sixiemeElement);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Erreur : Votre tableau est plus petit \n que l'élément auquel vous souhaitez accéder.");
            }
        }
}
