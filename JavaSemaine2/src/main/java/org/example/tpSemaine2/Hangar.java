package org.example.tpSemaine2;

import java.util.ArrayList;

public class Hangar<T> {

    private ArrayList<T> tableau;


    public Hangar(){
        tableau = new ArrayList<>();
    }

    public ArrayList<T> getAll() {
        return tableau;
    }

    public void addElement(T value){
        tableau.add(value);
    }

}