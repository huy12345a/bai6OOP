package circleCylinder;

public class Circle {
    private String color = "red";
    private double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double areaCircle() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "color=" + this.color + ", radius=" + this.radius;
    }
}