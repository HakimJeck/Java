package Lab4;

public class Cylinder extends Circle {
    private double height;
    public Cylinder(){

    }
    public Cylinder(double height, double radius){
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return 3.14 * getRadius() * getRadius() * height;
    }
    public double getArea(){
        return 2*3.14*getRadius()*height + 2*3.14*getRadius()*getRadius();
    }
    public String toString(){
        return "The tich va dien tich hinh tru la" + getVolume() + "va" + getArea();
    }
}
