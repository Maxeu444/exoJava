package org.example.poo;

public class Chaise {

static int nbrPieds;
static String material;
static String color;

    public Chaise(int nbrPieds, String material, String color) {
        this.nbrPieds = nbrPieds;
        this.material = material;
        this.color = color;
    }

    public Chaise(){
    }

    public int getNbrPieds() {
        return nbrPieds;
    }

    public void setNbrPieds(int nbrPieds) {
        this.nbrPieds = nbrPieds;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void showObject(){
        System.out.println("Je suis une chaise, avec " + nbrPieds + " pieds en " + material + " et de couleur " + color);
    }

    @Override
    public String toString() {
        return "Chaise{" +
                "nbrPieds=" + nbrPieds +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}


