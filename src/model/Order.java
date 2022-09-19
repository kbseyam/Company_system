package model;

import java.util.ArrayList;

public class Order {
    final int id;
    String date;
    boolean isPaid;
    Person person;
    ArrayList<Product> products;

    private static int idIncrementer = 0;

    public Order(String date, boolean isPaid, Person person, ArrayList<Product> products) {
        idIncrementer++;
        id = idIncrementer;

        this.date = date;
        this.isPaid = isPaid;
        this.person = person;
        this.products = products;
    }
}
