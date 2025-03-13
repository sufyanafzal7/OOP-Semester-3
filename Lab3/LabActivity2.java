package Lab3;

class Rectangle{
    private double length;
    private double width;

    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double areaOfRectangle(){
        return length*width;
    }


}

public class LabActivity2 {
    
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(3.2,4.5);
        System.out.println("Rectangle 1 area is "+ rectangle1.areaOfRectangle()+" with Length : "+rectangle1.getLength()+" and Width : "+rectangle1.getWidth());

    }
}
