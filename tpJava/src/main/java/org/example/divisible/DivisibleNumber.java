package org.example.divisible;

import java.util.Scanner;

public class DivisibleNumber {

    public static void isDivisible(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer un nombre: ");
        Integer nbr = scanner.nextInt();

        if (nbr%3!=0){
            System.out.println("le nombre n'est pas un multiple de 3");
        } else {
            System.out.println("Le nombre est un multiple de 3");
        }
    }

}
