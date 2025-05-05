package Lab8;

abstract class Convert{
    protected double val1;
    protected double val2;

    public Convert(){}

    public Convert(double val1) {
        this.val1 = val1;
        val2 = 0;
    }

    public double getVal1() {
        return val1;
    }

    public void setVal1(double val1) {
        this.val1 = val1;
    }

    public double getVal2() {
        return val2;
    }

    
    public abstract double compute();

    public void display(){
        System.out.printf("Value1 = %f , Value2 = %f",val1,val2);
    }
}

class LtoG extends Convert{

    public LtoG(){}
    public LtoG(double val1){
        super(val1);
    }

    @Override
    public double compute(){
        val2 = val1 * 0.26417;
        return val2;

    }


}


class FtoC extends Convert{

    public FtoC(){}
    public FtoC(double val1){
        super(val1);
    }

    @Override
    public double compute(){
        val2 = (5.0/9.0)*(val1-32.0);
        return val2;

    }

}


class FtoM extends Convert{

    public FtoM(){}
    public FtoM(double val1){
        super(val1);
    }

    @Override
    public double compute(){
        val2 = 0.3048*val1;
        return val2;

    }


}





public class Task3 {
    public static void main(String[] args) {

        LtoG LtoG1 = new LtoG(12);
        System.out.println("Liters to Gallons :"+LtoG1.compute());
        LtoG1.display();
        
        FtoC FtoC1 = new FtoC(1200);
        System.out.println("\n\nFahrenheit to Celsius :"+FtoC1.compute());
        FtoC1.display();
        
        FtoM FtoM1 = new FtoM(12);
        System.out.println("\n\nFahrenheit to Meter :"+FtoM1.compute());
        FtoM1.display();
        
    }
}
