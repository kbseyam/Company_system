package model;

public class Person {
    final int id;
    String name, phone, gender;
    private static int idIncrementer = 0;

    void printPersonInfo() {
        System.out.println("Person with id " + id + " info.");
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Gender: " + gender);
    }

    public Person(String name, String phone, String gender) {
        idIncrementer++;
        id = idIncrementer;

        this.name = name;
        this.phone = phone;
        this.gender = gender;
    }
}
