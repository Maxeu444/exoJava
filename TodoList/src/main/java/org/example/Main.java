package org.example;

import org.example.task.Task;

public class Main {
    public static void main(String[] args) {


        Task tache1 = new Task("Je dois faire l'exo");

        System.out.println(tache1.getDescription());
    }
}