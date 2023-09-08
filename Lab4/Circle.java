package Lab4;

public class Circle {
    private double radius;
    private String color;
    public Circle(){

    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public Circle(double radius){
        this.radius = radius;

    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
    public String toString(){
        return "Hinh tron co chu vi va dien tich " + radius*2*3.14 + getArea();
    }

}

