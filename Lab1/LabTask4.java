

class Rectangle{

    private double length;
    private double width;

    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public void setLength(double length){
        this.length = length;
    }
    public double getLength(){
        return length;
    }

    public void setWidth(double width){
        this.width = width;
    }
    public double getWidth(){
        return width;
    }

    public void display(){
        System.out.printf("Length = %f, Width = %f\n\n",length,width);
    }

    public double area(){
        return length*width;
    }

}

public class LabTask4 {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.display();
        Rectangle rectangle2 = new Rectangle(12, 23);
        rectangle2.display();
        rectangle2.setLength(24);
        rectangle2.setWidth(45);
        rectangle2.display();
        System.out.println("Area of Rectangle : "+rectangle2.area());
    }
}