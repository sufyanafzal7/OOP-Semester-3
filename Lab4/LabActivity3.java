package Lab4;

class Point{
    private int x;
    private int y;

    public Point(){
        x = 0;
        y = 0;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point addPoint(Point P){
        int newX = this.x + P.x;
        int newY = this.y + P.y;
        return new Point(newX, newY);
    }

    public void display(){
        System.out.printf("The point x = %d and y = %d\n\n",x,y);
    }

}


public class LabActivity3 {
    public static void main(String[] args) {

        Point point1 = new Point(3, 5);
        point1.display();
        Point point2 = new Point(4, 7);
        point2.display();

        Point point3 = point1.addPoint(point2);
        point3.display();
        
    }
}
