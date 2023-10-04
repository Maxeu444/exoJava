package org.example.liste;

import java.util.*;

public class DemoCollection {


    public static void main(String[] args) {
        // Demo pour vector
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");
        System.out.println("Vector : " +vector);

        //Méthode pour vector
        System.out.println("Taille du vector : "+vector.size());
        System.out.println("Élément à l'index  1: "+vector.get(1));
        System.out.println("Est ce que l'élément est présent : "+vector.contains("Banana"));

        //Demo pour SortedSet
        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("Java");
        sortedSet.add("Python");
        sortedSet.add("Javascript");
        sortedSet.add("Java"); // Non ajouté car doublons
        System.out.println("SortedSet " +sortedSet);


        //Méthode pour SortedSet
        System.out.println("Premier élément : " +sortedSet.first());
        System.out.println("Premier élément : " +sortedSet.last());
        SortedSet<String> headSet = sortedSet.headSet("Javascript");
        System.out.println( "Sous ensemble avant \"Javacript\" :"+ headSet);

        // Demo pour LinkedSet
        LinkedList<Double> linkedList = new LinkedList<>();
        linkedList.add(3.14);
        linkedList.add(2.65);
        linkedList.add(23.5);

        //Méthode pour LinkedList
        System.out.println("Premier élément "+ linkedList.getFirst());
        System.out.println("Seconde élément" + linkedList.getLast());
        linkedList.removeFirst();
        System.out.println("supression du premier élément : "+linkedList);


        //Demo pour sortedMap
        SortedMap<String, Integer> sortedMap = new TreeMap<>();
        sortedMap.put("Java", 44);
        sortedMap.put("Python", 4);
        sortedMap.put("c++", 22);
        System.out.println("SortedMap "+ sortedMap);

        //Methode pour le sortedMap
        System.out.println("Clés de mon sortedMap " + sortedMap.keySet());
        System.out.println("Valeurs de mon sortedMap " + sortedMap.values());
        sortedMap.remove("Java");
        System.out.println("SortedMap "+ sortedMap);

    }
}
