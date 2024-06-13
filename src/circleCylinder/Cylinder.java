package circleCylinder;

public class Cylinder extends Circle{
    private double height;
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    public double volumeCylinder(){
        return this.areaCircle()* height;
    }
    public String toString(){
        return "radius = "+
                getRadius()+
                "height = "+
                height +
                "volume Cylinder = " +
                volumeCylinder();
    }
}
