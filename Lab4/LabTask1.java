package Lab4;

class Distance{
    private int feet;
    private int inches;

    public Distance(){
        feet = 0;
        inches = 0;
    }

    public Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public void display(){
        System.out.printf("The Distance is : %dft%din \n\n",feet,inches);
    }

    public Distance addDistance(Distance D){
        int newFeet = this.feet + D.feet;
        int newInches = this.inches + D.inches;
        
        return new Distance(newFeet, newInches);
    }

}


public class LabTask1 {
    public static void main(String[] args) {

        Distance distance1 = new Distance(3, 4);
        System.out.println("Distance 1 : ");
        distance1.display();
        Distance distance2 = new Distance(5, 7);
        System.out.println("Distance 2 : ");
        distance2.display();
        
        Distance distance3 = distance1.addDistance(distance2);
        System.out.println("Added Distance 3 : ");
        distance3.display();
        
    }
}
