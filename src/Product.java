public class Product {
    final int id;
    String name;
    float price;

    private static int idIncrementer = 0;

    public Product(String name, float price) {
        idIncrementer++;
        id = idIncrementer;

        this.name = name;
        this.price = price;
    }
}
