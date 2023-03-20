package A3Q4;

public abstract class GeometricObject {
    public float area;

    public float perimeter;
    public boolean isFilled;
    public String color;

    public GeometricObject(boolean isFilled, String color) {
        this.isFilled = isFilled;
        this.color = color;
    }
}
