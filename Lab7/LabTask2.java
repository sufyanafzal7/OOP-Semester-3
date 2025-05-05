package Lab7;

abstract class Simple{
    protected int num1;
    protected int num2;

    public Simple(){
        num1 = 1;
        num2 = 2;
    }

    public Simple(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    abstract public void add();
    abstract public void sub();
    abstract public void mul();
    abstract public void div();
    abstract public void display();
}

class VerifiedSimple extends Simple{
    public VerifiedSimple(int num1, int num2){
        super(num1, num2);

    }


    @Override
    public void display(){
        System.out.printf("num1 = %d, num2 = %d\n",num1,num2);
    }

    @Override
    public void add(){
        if(num1>0 && num2>0){
            System.out.printf("\nThe sum = %d",num1+num2);
            return;
        }
        else{
            System.out.println("Wrong Input");
        }
    }
    @Override
    public void sub(){
        if(num1>0 && num2>0){
            System.out.printf("\nThe sub = %d",num1-num2);
            return;
        }
        else{
            System.out.println("Wrong Input");
        }
    }
    @Override
    public void mul(){
        if(num1>0 && num2>0){
            System.out.printf("\nThe mul = %d",num1*num2);
            return;
        }
        else{
            System.out.println("Wrong Input");
        }
    }
    @Override
    public void div(){
        if(num1>0 && num2>0){
            System.out.printf("\nThe div = %d",num1/num2);
            return;
        }
        else{
            System.out.println("Wrong Input");
        }
    }
}

public class LabTask2 {
    public static void main(String[] args) {

        VerifiedSimple verifiedSimple1 = new VerifiedSimple(23, 12);
        verifiedSimple1.display();
        verifiedSimple1.add();
        verifiedSimple1.sub();
        verifiedSimple1.mul();
        verifiedSimple1.div();
        
    }
}
