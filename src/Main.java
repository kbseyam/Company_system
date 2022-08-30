import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Client person1 = new Client("Mohamad", "+96170123456", "Male", "mhamad@example.com");
        Employee person2 = new Employee("Nadine", "+9631249392", "Female", 800f, "8:00 AM to 3:00 PM");

        Product product1 = new Product("Keyboard", 15f);
        Product product2 = new Product("Camera", 45f);
        Product product3 = new Product("HDD 1TB", 70f);
        Product product4 = new Product("SSD 1TB", 274.66f);
        Product product5 = new Product("Mouse", 8f);
        Product product6 = new Product("Table", 44.55f);

        ArrayList<Product> order1Products = new ArrayList<>();
        order1Products.add(product1);
        order1Products.add(product2);
        order1Products.add(product3);

        ArrayList<Product> order2Products = new ArrayList<>();
        order2Products.add(product4);

        ArrayList<Product> order3Products = new ArrayList<>();
        order3Products.add(product5);
        order3Products.add(product6);

        Order order1 = new Order("2020-1-1", true, person1, order1Products);
        Order order2 = new Order("2020-2-7", true, person1, order2Products);
        Order order3 = new Order("2020-5-4", false, person2, order3Products);

        Company company = new Company();

        company.addPerson(person1);
        company.addPerson(person2);

        company.addProduct(product1);
        company.addProduct(product2);
        company.addProduct(product3);
        company.addProduct(product4);
        company.addProduct(product5);
        company.addProduct(product6);

        company.addOrder(order1);
        company.addOrder(order2);
        company.addOrder(order3);

        company.printPersonInfo(1);
        company.printPersonInfo(2);

        company.printProductDetails(1);
        company.printProductDetails(2);
        company.printProductDetails(3);
        company.printProductDetails(4);
        company.printProductDetails(5);
        company.printProductDetails(6);

        company.printPersonOrders(1);
        company.printPersonOrders(2);

        company.removeOrder(1);
        company.printOrderDetails(1);
        company.printPersonOrders(1);
    }
}