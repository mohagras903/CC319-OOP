package A1Q9;

public class Test {
    private int id;
    public void m1() {
        this.id = 45;
    }
    public void m2() {
        //mistake:
        //Test.id = 45;
        //  id is not a static field so it could not be accessed like this
    }

}