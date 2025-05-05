package Lab8;

abstract class Person{
    protected String name;
    public Person(){
        name = "Sufyan Afzal";
    }
    public Person(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public abstract boolean isOutstanding();
}


class Student extends Person{
    private double CGPA;
    public Student(){
        CGPA = 3.6;
    }
    public Student(String name, double cGPA) {
        super(name);
        CGPA = cGPA;
    }
    public double getCGPA() {
        return CGPA;
    }
    public void setCGPA(double cGPA) {
        CGPA = cGPA;
    }
    
    @Override
    public boolean isOutstanding(){
        return CGPA>3.5;
    }
}

class Professor extends Person{
    private int numberOfPublications;
    public Professor(){
        numberOfPublications = 51;
    }
    public Professor(String name, int numberOfPublications){
        super(name);
        this.numberOfPublications = numberOfPublications;
    }
    public int getNumberOfPublications() {
        return numberOfPublications;
    }
    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }

    @Override
    public boolean isOutstanding(){
        return numberOfPublications>50;
    }
}

public class Task2 {
    public static void main(String[] args) {
        Person[] person1 = new Person[100];
        person1[0] = new Student("Sufyan Afzal", 3.9);
        person1[1] = new Professor("Sufyan Malik", 100);
        
        for(Person people : person1){
            System.out.println(people.getName()+" is outstanding "+people.isOutstanding());
        }

        
    }
}
