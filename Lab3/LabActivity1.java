package Lab3;

class Circle{
    private double radius;

    public Circle(){
        radius = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double areaOfCircle(){
        return Math.PI*radius*radius;
    }

}

public class LabActivity1 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        System.out.println("Circle 1 area : "+circle1.areaOfCircle());
    }
}
