package A2Q10;

public class Student extends Person{

    public ClassStatus classStatus;
    public Student(String name, String email, String address, String phoneNumber, ClassStatus classStatus) {
        super(name, email, address, phoneNumber);
        this.classStatus = classStatus;
    }

    @Override
    public String toString() {
        return "Class: Student" + "Name: " + this.getName();
    }
}
