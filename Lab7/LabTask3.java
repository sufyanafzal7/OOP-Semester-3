package Lab7;

abstract class Shape{
    protected int numberOfLines;
    protected String penColor;
    protected String fillColor;

    public Shape(){
        numberOfLines = 4;
        penColor = "black";
        fillColor = "Bolack";
    }

    public Shape(int numberOfLines, String penColor, String fillColor) {
        this.numberOfLines = numberOfLines;
        this.penColor = penColor;
        this.fillColor = fillColor;
    }

    

    public int getNumberOfLines() {
        return numberOfLines;
    }

    public void setNumberOfLines(int numberOfLines) {
        this.numberOfLines = numberOfLines;
    }

    public String getPenColor() {
        return penColor;
    }

    public void setPenColor(String penColor) {
        this.penColor = penColor;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    abstract public void display();

}

class Circle extends Shape{

    public Circle(int numberOfLines, String penColor, String fillColor){
        super(numberOfLines,penColor,fillColor);
    }

    @Override
    public void display(){
        System.out.println("This is circle");
        System.out.printf("Number of Lines : %d, Pen Color : %s, Fill Color : %s",numberOfLines,penColor,fillColor);
    }
}

class Square extends Shape{

    public Square(int numberOfLines, String penColor, String fillColor){
        super(numberOfLines,penColor,fillColor);
    }

    @Override
    public void display(){
        System.out.println("\nThis is Square");
        System.out.printf("Number of Lines : %d, Pen Color : %s, Fill Color : %s",getNumberOfLines(),getPenColor(),getFillColor());
    }
}

class Triangle extends Shape{

    public Triangle(int numberOfLines, String penColor, String fillColor){
        super(numberOfLines,penColor,fillColor);
    }

    @Override
    public void display(){
        System.out.println("\nThis is Triangle");
        System.out.printf("Number of Lines : %d, Pen Color : %s, Fill Color : %s",getNumberOfLines(),getPenColor(),getFillColor());
    }
}

public class LabTask3 {
    public static void main(String[] args) {

        Circle circle1 = new Circle(4,"Red","Black");
        Square square1 = new Square(4,"Red","Black");
        Triangle triangle1 = new Triangle(4,"Red","Black");

        circle1.display();
        square1.display();
        triangle1.display();
        
    }
}
