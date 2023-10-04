package org.example.hotelTp;

import java.util.Scanner;

public class Client {
    public static long number;
    private static int count;
    private int id;
    private String name;
    private String firstname;

    {
        ++count;
    }

    public Client(String name, String firstname, long number) {
        this.id = count;
        this.name = name;
        this.firstname = firstname;
        this.number = number;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Client.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

}
