package model;

import java.util.ArrayList;

public class Company {
    ArrayList<Person> people = new ArrayList<>();
    ArrayList<Product> products = new ArrayList<>();
    ArrayList<Order> orders = new ArrayList<>();

    // Print products and return total price
    private float printProducts(ArrayList<Product> products) {
        float total = 0;

        for (Product product : products) {
            System.out.println("- " + product.name + ": " + product.price + '$');
            total += product.price;
        }

        return total;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeProduct(int id) {
        for (Product product : products) {
            if (product.id == id) {
                products.remove(product);
                return;
            }
        }

        System.out.println("Product with id " + id + " is not found!");
        System.out.println("----------------------");
    }

    public void removePerson(int id) {
        for (Person person : people) {
            if (person.id == id) {
                people.remove(person);
                return;
            }
        }

        System.out.println("Person with id " + id + " is not found!");
        System.out.println("----------------------");
    }

    public void removeOrder(int id) {
        for (Order order : orders) {
            if (order.id == id) {
                orders.remove(order);
                return;
            }
        }

        System.out.println("Order with id " + id + " is not found!");
        System.out.println("----------------------");
    }

    public void printPersonInfo(int id) {
        for (Person person : people) {
            if (person.id == id) {
                person.printPersonInfo();
                System.out.println("----------------------");
                return;
            }
        }

        System.out.println("Person with id " + id + " is not found!");
        System.out.println("----------------------");
    }

    public void printProductDetails(int id) {
        for (Product product : products) {
            if (product.id == id) {
                System.out.println("Product with id " + id + " details.");
                System.out.println("Name: " + product.name);
                System.out.println("Price: " + product.price);
                System.out.println("----------------------");

                return;
            }
        }

        System.out.println("Product with id " + id + " is not found!");
        System.out.println("----------------------");
    }

    public void printOrderDetails(int id) {
        for (Order order : orders) {
            if (order.id == id) {
                System.out.println("Order with id " + id + " details.");
                System.out.println("Date: " + order.date);
                System.out.println("Is paid: " + ((order.isPaid) ? "yes" : "no"));
                System.out.println("Ordered by: " + order.person.name);
                System.out.println("Products: ");
                // Print products and return total
                float total = printProducts(order.products);
                System.out.println("Total: " + total + "$");
                System.out.println("----------------------");

                return;
            }
        }

        System.out.println("Order with id " + id + " is not found!");
        System.out.println("----------------------");
    }

    public void printPersonOrders(int id) {
        for (Person person : people) {
            if (person.id == id) {
                System.out.println("All orders made by person with id " + id + ":");

                for (Order order : orders) {
                    if (order.person.id == id) {
                        System.out.println("> Order: #" + order.id);
                        System.out.println("  Date: " + order.date);
                        System.out.println("  Is paid: " + ((order.isPaid) ? "yes" : "no"));
                        System.out.println("  Ordered by: " + order.person.name);
                        System.out.println("  Products:");
                        // Print products and return total
                        float total = printProducts(order.products);
                        System.out.println("Total: " + total + "$");
                    }
                }

                System.out.println("----------------------");
                return;
            }
        }

        System.out.println("Person with id " + id + " is not found!");
        System.out.println("----------------------");
    }

}
