package Lab4;

public class TestCC {
    public static void main(String[] args) {
        Circle circle = new Circle(24.5);
        System.out.println("Dien tich: "+ circle.getArea());
        Cylinder cylinder = new Cylinder( 21.5, 3.66);
        System.out.println(("The tich hinh tru"+ cylinder.getVolume()));
    }
}
