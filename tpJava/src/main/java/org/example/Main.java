package org.example;

import org.example.FindCarre.FindCarre;
import org.example.array.ArrayExo;
import org.example.askName.AskName;
import org.example.category.CategorieAge;
import org.example.chaineCaract.ChaineCaract;
import org.example.divisible.DivisibleNumber;
import org.example.findNegPos.PosiNega;
import org.example.multiplication.Multiply;
import org.example.poo.Chaise;
import org.example.price.Price;
import org.example.produit.Produit;
import org.example.reprographie.ImpressionPrix;
import org.example.somme.Somme;

public class Main {
    public static void main(String[] args) {


//        FindCarre.getCarre();
//        AskName.askName();
//        Price.getPrice();
//        PosiNega.findPolarite();
//        Produit.getProduit();
//        CategorieAge.getCate();
//        DivisibleNumber.isDivisible();
//        ImpressionPrix.getPrice();
//        Multiply.getMultiply();
//        Somme.getSomme();
//        ArrayExo.doDecalage();
//        ChaineCaract.findAnagram();

        Chaise chaise1 = new Chaise();
        Chaise chaise2 = new Chaise(4, "bois", "marron");

        chaise1.showObject();
        chaise2.showObject();


    }
}