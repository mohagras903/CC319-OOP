package A2Q5;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return value%2 == 0;
    }
    public boolean isOdd() {
        return value%2 != 0;
    }

    public boolean isPrime() {
        boolean isPrimeFlag = true;
        for(int i =2; i<=value/2; i++) {
            if(value%i==0) {
                isPrimeFlag = false;
                break;
            }
        }
        return isPrimeFlag;
    }

    public static boolean isEven(int value) {
        return value%2 == 0;
    }
    public static boolean isOdd(int value) {
        return value%2 != 0;
    }

    public static boolean isPrime(int value) {
        boolean isPrimeFlag = true;
        for(int i =2; i<=value/2; i++) {
            if(value%i==0) {
                isPrimeFlag = false;
                break;
            }
        }
        return isPrimeFlag;
    }
    public static boolean isEven(MyInteger object) {
        int value = object.getValue();
        return value%2 == 0;
    }
    public static boolean isOdd(MyInteger object) {
        int value = object.getValue();

        return value%2 != 0;
    }

    public static boolean isPrime(MyInteger object) {
        int value = object.getValue();

        boolean isPrimeFlag = true;
        for(int i =2; i<=value/2; i++) {
            if(value%i==0) {
                isPrimeFlag = false;
                break;
            }
        }
        return isPrimeFlag;
    }

    public boolean equals(MyInteger obj) {
        return obj.value == this.value;
    }
    public boolean equals(int value) {
        return value == this.value;
    }
}
