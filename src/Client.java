public class Client extends Person {
    String email;

    public Client(String name, String phone, String gender, String email) {
        super(name, phone, gender);
        this.email = email;
    }

    @Override
    void printPersonInfo() {
        super.printPersonInfo();
        System.out.println("Email: " + email);
    }
}
