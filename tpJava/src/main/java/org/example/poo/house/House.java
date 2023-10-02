package org.example.poo.house;

import static org.example.poo.house.House.Door.color;

public class House {

    static int surface;

    public House(int surface) {
        this.surface = surface;
    }

    public void display(){
        System.out.println("Je suis une maison," +
                " ma surface est de " + surface + "m²");
    }

    public int getSurface() {
        return surface;
    }
    public void setSurface(int surface) {
        this.surface = surface;
    }

    public static class  Door{
        static String color = "bleu";

        public Door() {
        }

        public static void displayDoor(){
            System.out.println("Je suis une porte, ma couleur est " + color );
        }

        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            Door.color = color;
        }
    }

    public void getDoor(){

            Door porte = new Door();


    }


}
