package org.example.reprographie;

import java.util.Scanner;

public class ImpressionPrix {

    public static void getPrice(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer le nombre de copies souhaitées: ");
        Integer nbrCopies = scanner.nextInt();
        float price;

        if (nbrCopies > 20){
            price = 0.05F;
        } else if (nbrCopies > 10 ) {
            price = 0.10F;
        } else {
            price=0.15F;
        }

        System.out.println("le prix de vos copies est de " + nbrCopies*price + " Euros");
    }
}
