package A2Q5;

public class Main  {
    public static void main(String[] args) {
        MyInteger sample =  new MyInteger(2);
        System.out.println(sample.getValue());
        System.out.println(sample.isEven());
        System.out.println(sample.isOdd());
        System.out.println(sample.isPrime());
        System.out.println(sample.equals(8));
        System.out.println(sample.equals(new MyInteger(8)));
    }

}
