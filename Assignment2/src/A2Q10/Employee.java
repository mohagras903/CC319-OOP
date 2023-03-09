package A2Q10;

import java.util.Date;

public class Employee extends Person{
    private String office;
    private double salary;
    private Date dateHired;

    public Employee(String name, String email, String address, String phoneNumber, String office, double salary, Date dateHired) {
        super(name, email, address, phoneNumber);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Class: Employee\n" + "Name: " + this.getName();
    }
}
