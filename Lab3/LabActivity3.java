package Lab3;

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

    public String toString(){
        return ("X-coordinate : "+xCoordinate+", Y-coordinate : "+yCoordinate);
    }

    public void movePoints(int a, int b){
        xCoordinate += a;
        yCoordinate += b;
    }

}

public class LabActivity3 {
    public static void main(String[] args) {

        Point point1 = new Point(3, 6);
        System.out.println("Point 1:");
        System.out.println(point1.toString());
        
        Point point2 = new Point(5, 6);
        point2.movePoints(3, 4);
        System.out.println("Point 2: ");
        System.out.println(point2.toString());
    }
}
