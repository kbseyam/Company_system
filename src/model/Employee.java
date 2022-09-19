package model;

public class Employee extends Person {
    float salary;
    String workingTime;

    public Employee(String name, String phone, String gender, float salary, String workingTime) {
        super(name, phone, gender);
        this.salary = salary;
        this.workingTime = workingTime;
    }

    @Override
    void printPersonInfo() {
        super.printPersonInfo();
        System.out.println("Salary: " + salary + "$");
        System.out.println("Working time: " + workingTime);
    }
}
