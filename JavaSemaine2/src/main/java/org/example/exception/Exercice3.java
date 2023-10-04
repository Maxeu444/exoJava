package org.example.exception;

public class Exercice3 {
        public static void main(String[] args) {

            int[] tab = new int[5];

            try {
                int index6 = tab[5];
                System.out.println("La valeur du sixième élément est : " + index6);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Erreur : Votre tableau est plus petit \n que l'élément auquel vous souhaitez accéder.");
            }
        }
}
