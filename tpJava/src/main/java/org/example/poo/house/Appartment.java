package org.example.poo.house;

import static org.example.poo.house.House.Door.color;

public class Appartment extends House {


    public Appartment(int surface) {
        super(surface);
        surface = 50;
    }

    public static class Person{
        String nom;

        public Person(String nom) {
            this.nom = nom;
        }

       public void displayPerson(){
           System.out.println("Je m'appele " + nom);
           System.out.println("Je suis un appartement de " + surface + "m²");
           System.out.println("Je suis une porte de couleur " + color);
       }
    }
}
