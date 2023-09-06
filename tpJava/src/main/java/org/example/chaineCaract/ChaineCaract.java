package org.example.chaineCaract;


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




    }

}
