package Lab4;

class Fraction{
    private int value1;
    private int value2;

    public Fraction(){
        value1 = 0;
        value2 = 0;
    }

    public Fraction(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public Boolean equals(Fraction F){
        if(this.value1 == F.value1 && this.value2 == F.value2){
            System.out.println("The Objects have equal raio of Fraction : "+F.value1+"/"+F.value2);
        return true;}
        return false;
    }


    public void display(){
        System.out.println("The ratio is : "+this.value1+"/"+this.value2);
    }

    

}


public class LabTask3 {
    public static void main(String[] args) {

        Fraction fraction1 = new Fraction(2, 4);
        Fraction fraction2 = new Fraction(2, 4);
        System.out.println("For Fraction 1:");
        fraction1.display();
        System.out.println();
        System.out.println();
        System.out.println("For Fraction 2:");
        fraction2.display();
        System.out.println();
        System.out.println();
        fraction1.equals(fraction2);
        System.out.println();
        
    }
}
