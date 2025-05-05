package Lab6;

class Person{
    protected String name ; 
    protected String id ; 
    protected int phone ;

    public Person(){
        name = "Sufyan";
        id = "fa23-bai-061";
        phone = 123456;
    }
    
    public Person(String name, String id, int phone) {
        this.name = name;
        this.id = id;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void display(){
        System.out.println("The details of Person are : ");
        System.out.printf("Name : %s, ID : %s, Phone : %d\n",name,id,phone);
    }


}

class Student extends Person{
    private String rollNo; 
    private int marks ;
    public Student(String rollNo, int marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public Student(){
        super();
        rollNo = "fa23-bai-061";
        marks = 99;
    }

    public Student(String name, String id, int phone, String rollNo, int marks) {
        super(name, id, phone);
        this.rollNo = rollNo;
        this.marks = marks;
    }
    public String getRollNo() {
        return rollNo;
    }
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void display(){
        super.display();
        System.out.println("The information about Student is: ");
        System.out.printf("Roll No: %s, Marks: %d",rollNo,marks);
    }

}

public class LabActivity1 {
    public static void main(String[] args) {

        Student student1 = new Student("Sufyan Afzal", "FA23-BAI-061", 123456, "af23-bai-061", 100);
        student1.display();
        
        
    }
}
