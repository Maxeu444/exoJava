package org.example.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Trader abdallah = new Trader("Abdallah","Cambridge");
        Trader audrey = new Trader("Audrey","Milan");
        Trader corentin = new Trader("Corentin","Cambridge");
        Trader tristan = new Trader("Tristan","Cambridge");

        List<Transaction> transactions = Arrays.asList( new Transaction(abdallah, 2011,400), new
                Transaction(abdallah, 2012,300),new Transaction(audrey, 2012,1000),new
                Transaction(audrey, 2011,400),new Transaction(corentin, 2012,710),new
                Transaction(corentin, 2012,700),new Transaction(tristan, 2012,950),new
                Transaction(abdallah, 2022,900));


        List<Transaction> transactionSorted = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .toList();
        transactionSorted.forEach(System.out::println);

        List<String> citiesSorted = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(citiesSorted);


    }
}
