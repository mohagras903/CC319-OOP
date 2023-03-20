package A3Q4;

public class Triangle extends GeometricObject{
    public float side1;
    public float side2;
    public float side3;

    public Triangle(float side1, float side2, float side3, boolean isFilled, String color ) {
        super(isFilled, color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.area = (float) (0.5 * this.side1 * this.side2);
        this.perimeter = this.side1 + this.side2 + this.side3;
    }

    public void printData() {
        System.out.println("Area: "+ this.area);
        System.out.println("Perimeter: "+ this.perimeter);
        System.out.println("Color: "+this.color);
        System.out.println("Is filled: "+ this.isFilled);
    }
}
