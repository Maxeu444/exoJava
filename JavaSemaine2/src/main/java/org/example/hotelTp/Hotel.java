package org.example.hotelTp;
import java.util.ArrayList;

public class Hotel<T> {

    private ArrayList<T> listClient;
    private ArrayList<T> listRoom;
    private ArrayList<T> listBooking;

    public Hotel(){
        listClient = new ArrayList<T>();
        listRoom = new ArrayList<T>();
        listBooking = new ArrayList<T>();
    }

    public ArrayList<T> getListClient(){
        return listClient;
    }
    public ArrayList<T> getListRoom(){
        return listRoom;
    }
    public ArrayList<T> getListBooking(){
        return listBooking;
    }

    public void addClient(T value){
        this.listClient.add(value);
    }
}
