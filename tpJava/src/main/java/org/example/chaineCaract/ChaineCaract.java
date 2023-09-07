package org.example.chaineCaract;


import java.util.Arrays;
import java.util.Scanner;

public class ChaineCaract {



    public static void countWords(){
        String s = "Combien de mots dans cette phrase, ma foi très longue";
        int result = 0;

        while (s.contains(" ")){
            String words[] = s.split(" ");
            result = words.length;
            break;
        }
        System.out.println("Il y a " + result + " mots dans votre phrase");
    }

    public static void  countOccurence(){

        String s2 = "ordinateur";
        int count = 0;

        for (int i = 0; i < s2.length(); i++) {
          if (s2.charAt(i) == 'o'){
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }


    public static void findAnagram() {

        Scanner scn = new Scanner(System.in);
        System.out.println("Entrer un 1er mot: ");
        String mot1 = scn.next();
        System.out.println("Entrer un 2eme mot: ");
        String mot2 = scn.next();


        if (mot1.length() == mot2.length()) {

            char[] charArray1 = mot1.toCharArray();
            char[] charArray2 = mot2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

           String newWord = new String(charArray1);
           String newOtherWord = new String(charArray2);

           if (newWord.equals(newOtherWord))
               System.out.println("les mots sont des anagramme");
           else
               System.out.println("les mots ne sont pas des anagramme");

        } else {
            System.out.println("les mots ne sont pas des anagramme");
        }
    }
}
