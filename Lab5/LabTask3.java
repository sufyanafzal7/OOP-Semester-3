package Lab5;

class Point{
    private int xCoordinate;
    private int yCoordinate;

    public Point(){
        xCoordinate = 0;
        yCoordinate = 0;
    }

    public Point(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public void display(){
        System.out.println("\nThe co-ornidates of Point are : ");
        System.out.printf("X-coordinate : %d, Y-coordinate : %d\n\n",xCoordinate,yCoordinate);
    }

}

class Line{
    private Point startPoint;
    private Point endPoint;

    public Line(){

    }

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    public double length() {
        int x1 = startPoint.getxCoordinate();
        int y1 = startPoint.getyCoordinate();
        int x2 = endPoint.getxCoordinate();
        int y2 = endPoint.getyCoordinate();

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public void display(){
        System.out.println("The information of Line is as: \n");
        System.out.print("Start Point : ");startPoint.display();
        System.out.print("End Point : ");endPoint.display();
    }

}

public class LabTask3 {
    public static void main(String[] args) {

        Point point1 = new Point(3, 4);
        Point point2 = new Point(5, 2);

        Line line2 = new Line(point1, point2);
        line2.display();
        System.out.println("The Length of Line1 : "+line2.length());
        System.out.println();
        System.out.println();
        System.out.println();

        line2.getStartPoint().setxCoordinate(7);
        line2.getStartPoint().setyCoordinate(9);

        line2.getEndPoint().setxCoordinate(8);
        line2.getEndPoint().setyCoordinate(6);

        Line line3 = new Line(point1, point2);
        line3.display();

        System.out.println("The Length of Line2 : "+line3.length());
        
    }
}
