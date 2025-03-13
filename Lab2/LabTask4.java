package Lab2;

class Marks{
    private double subject1;
    private double subject2;
    private double subject3;

    public Marks(){
        subject1 = 0;
        subject2 = 0;
        subject3 = 0;
    }

    public Marks(double subject1, double subject2, double subject3){
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    public void setSubject1(double subject1){
        this.subject1 = subject1;
    }
    public double getSubject1(){
        return subject1;
    }

    public double getSubject2() {
        return subject2;
    }

    public void setSubject2(double subject2) {
        this.subject2 = subject2;
    }

    public double getSubject3() {
        return subject3;
    }

    public void setSubject3(double subject3) {
        this.subject3 = subject3;
    }
    
    public double calculation(){
        return subject1+subject2+subject3;
    }

}



public class LabTask4 {
    public static void main(String[] args) {
        Marks studen1Marks = new Marks(78, 90, 80);
        System.out.println("Student 1 Calculated Marks :  "+studen1Marks.calculation());
    }
}
