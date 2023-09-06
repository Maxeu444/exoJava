package org.example.askName;

import java.util.Scanner;

public class AskName {


    public static void  askName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est votre nom ?");
        String name = scanner.next();
        System.out.println("Bonjour, " + name + " !");
    }







}
