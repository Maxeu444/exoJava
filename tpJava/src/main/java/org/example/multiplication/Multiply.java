package org.example.multiplication;

import java.util.Scanner;

public class Multiply {

    public static void getMultiply (){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre :");
        Integer number = scanner.nextInt();
        int multiplier = 1;

        for (int i = 0; i < 10; i++) {
            System.out.println(number + " x " + multiplier +" = " + number*multiplier);
            multiplier++;
        }

    }

}
