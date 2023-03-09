package A2Q10;

import java.util.Date;

public class Faculty extends Employee{
    private int officeHours;
    private int rank;

    public Faculty(String name, String email, String address, String phoneNumber, String office, double salary, Date dateHired, int officeHours, int rank) {
        super(name, email, address, phoneNumber, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    @Override
    public String toString() {
        return "Class: Faculty\n" + "Name: " + this.getName();
    }
}
