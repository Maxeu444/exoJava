package org.example.ihm;
import org.example.classes.Hotel;

import java.util.Scanner;

public class IhmConsole {

    public static void start(){
        System.out.println("Que souhaitez vous faire ? \n 1 - Créer un hotel \n 2 - Dire miaou"
        );
        Scanner scn = new Scanner(System.in);
        int choice = scn.nextInt();


        switch (choice){
            case 0:
                break;

            case 1:
                System.out.println("Veuillez entrer le nom de l'hotel");
                String val= scn.next();
                Hotel hotel1 = new Hotel(val);





                System.out.println("\n Que souhaitez vous faire maintenant ? \n 1 - Créer un hotel \n 2 - Dire miaou"
                );
                choice = scn.nextInt();
            case 2:
                System.out.println("miaou"); ;
                System.out.println("Que souhaitez vous faire maintenant ? \n 1 - Créer un hotel \n 2 - Dire miaou"
                );
                choice = scn.nextInt();
        }
    }
}
