package A4Q1;

public class Main {
    /*
    Q1:
        - If the exception is caught, statement 3 won't be executed
        - If the exception is not caught, statement 4 will be executed
        - If the exception is caught, statement 4 will be executed as well
    */
    public static void main(String[] args) {
        try {
            System.out.println("1");
            System.out.println(1/0);
            System.out.println("2");
        }
        catch(Exception e) {
            System.out.println("Caught");
        }
        System.out.println("4");

    }
}
