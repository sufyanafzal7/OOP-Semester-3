package Lab3;

class Student{
    private String name;
    private int[] marksArray;
    private double sum;


    public Student(String name, int[] marksArray) {
        this.name = name;
        this.marksArray = marksArray;
    }

    public double getMarksAverage(){
        
        for(int i = 0; i<5; i++){
            sum = sum + i;

        }
        return (sum/5.0);
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int[] getMarksArray() {
        return marksArray;
    }


    public void setMarksArray(int[] marksArray) {
        this.marksArray = marksArray;
    }

    public void displayMarks(){
        System.out.println("Marks are: ");
        for(int i = 0; i<5; i++){
            System.out.print(" "+marksArray[i]);
        }
    }


    
}


public class LabTask3 {
    public static void main(String[] args) {
        System.out.println();
        Student student1 = new Student("Malik", new int []{99,67,78,56,89});
        System.out.println(student1.getName()+"'s Avarage: "+student1.getMarksAverage());
        student1.displayMarks();

        System.out.println();
        Student student2 = new Student("Sufyan", new int []{99,97,98,96,95});
        System.out.println(student2.getName()+"'s Avarage: "+student2.getMarksAverage());
        student2.displayMarks();

        if(student1.getMarksAverage() < student2.getMarksAverage()){
            System.out.println(student1.getName()+" has higher avg of "+student1.getMarksAverage());
        }else
        if(student2.getMarksAverage() < student1.getMarksAverage()){
            System.out.println(student2.getName()+" has higher avg of "+student2.getMarksAverage());
        }
        else{
            System.out.println("Both have same avg.");
        }

        Student student3 = new Student(student1.getName(),student2.getMarksArray());
        System.out.println(student3.getName()+"'s Avarage: "+student3.getMarksAverage());
        student3.displayMarks();

        
    }
}
