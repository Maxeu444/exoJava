package org.example.tpSemaine2;

import java.util.Scanner;

public class BankAccount {

int accountNumber = 1;
float soldeCompte;
String ownerName;
Scanner scanner = new Scanner(System.in);

    public BankAccount(float soldeCompte, String ownerName) {
        this.soldeCompte = soldeCompte;
        this.ownerName = ownerName;
        accountNumber++;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getSoldeCompte() {
        return soldeCompte;
    }

    public void setSoldeCompte(float solde) {
        this.soldeCompte = solde;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public void déposer() {

        System.out.println("Entrer la somme à déposer: ");
        float number = scanner.nextFloat();
        soldeCompte = soldeCompte + number;

        System.out.println("Votre nouveau solde est: " + soldeCompte);
    }

    public void retrait() {

        System.out.println("Entrez la somme à retirer: ");
        float number = scanner.nextFloat();

        if (number > soldeCompte){
            System.out.println("retrait impossible, solde inssufisant");
        } else {
            soldeCompte = soldeCompte - number;
            System.out.println("Votre nouveau solde est: " + soldeCompte);
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", soldeCompte=" + soldeCompte +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
