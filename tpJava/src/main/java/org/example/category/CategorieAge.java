package org.example.category;

import java.util.Scanner;

public class CategorieAge {

    public static void getCate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer l'âge de l'enfant:");
        Integer age = scanner.nextInt();

        if (age <=7) {
            System.out.println("Catégorie poussin");
        }else if (age <= 9){
            System.out.println("Catégorie Pupille");
        } else if (age <= 11) {
            System.out.println("Catégorie minime ");
        } else {
            System.out.println("Catégorie Cadet");
        }
    }

}
