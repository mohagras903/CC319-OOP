package A2Q10;

import java.util.Date;

public class StaffMember extends Employee{
    private String title;

    public StaffMember(String name, String email, String address, String phoneNumber, String office, double salary, Date dateHired, String title) {
        super(name, email, address, phoneNumber, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Class: Staff Member\n" + "Name: " + this.getName();
    }
}
