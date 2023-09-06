package org.example.array;

import java.util.Scanner;

public class ArrayExo {

    public static void getNote(){

        Scanner scn = new Scanner(System.in);
        int[] tab;
        tab = new int[5];
        System.out.println("Veuillez rentrer les notes /20");

        for (int i = 0; i < tab.length; i++) {
            tab[i] = scn.nextInt();
        }

        float moyenne = 0F;
        for (int i = 0; i < tab.length; i++) {
            moyenne += tab[i];
        }
        moyenne = moyenne / tab.length;

        System.out.println( "La moyenne des notes est : " + moyenne);

        int max = 0;
        int min = 20;


        for (int i = 0; i < tab.length; i++) {
            if (tab[i]>max){
                max = tab[i];
            }
        }
        for (int i = 0; i < tab.length; i++) {
            if (tab[i]< min){
                min = tab[i];
            }
        }
        System.out.println("Le maximum est " + max);
        System.out.println("Le maximum est " + min);



//        for (int i = 0; i <tab.length ; i++) {
//            System.out.println(tab[i]);
//       }
    }


    public static void  doDecalage(){

        Scanner scn = new Scanner(System.in);

    char[] tabWord = {'D','E','C','A','L','A','G','E'};
        char temp = tabWord[0];
        for (int i = 0; i < tabWord.length-1; i++) {
            tabWord[i] = tabWord[i+1];
        }
        tabWord[tabWord.length-1] = temp;

        System.out.println(tabWord);





    }



}