package Lab6;

import java.util.Date;

class Person{
    protected String name;
    protected String address;
    protected int phoneNumber;
    protected String email;


    public Person(){
        name = "Sufyan Afzal";
        address = "BWP";
        phoneNumber = 123456;
        email = "suf@gmail.com";
    }


    public Person(String name, String address, int phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public int getPhoneNumber() {
        return phoneNumber;
    }


    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public void display(){
        System.out.println("\nThe information about Person is : ");
        System.out.printf("Name : %s, Address : %s, Phone Number : %d, Email : %s\n",name,address,phoneNumber,email);
    }

}

class Student extends Person{
    private String status;

    public Student(){
        super();
        status = "BAI";
    }

    public Student(String name, String address, int phoneNumber, String email, String status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("The information about Student is : ");
        System.out.printf("Status : %s\n",status);

    }

}

class Employee extends Person{
    protected String office;
    protected int salary;
    protected Date dateHired;

    public Employee(){
        super();
        office = "COMSATS";
        salary = 345;
        dateHired = new Date();
    }

    public Employee(String name, String address, int phoneNumber, String email, String office, int salary,
            Date dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("The information about Employee is as: ");
        System.out.printf("Office : %s, Salary : %d ",office,salary);
        System.out.println("Date Hired : "+dateHired);
    }

}

class Faculty extends Employee{
    private Time officeHours;
    private String rank;
    
    public Faculty(){
        super();
        officeHours = new Time();
        rank = "Diamond";
    }

    public Faculty(String name, String address, int phoneNumber, String email, String office, int salary,
            Date dateHired, Time officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public Time getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(Time officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("The information about Faculty is as: ");
        System.out.println("Office Hours : "+officeHours+" , Rank : "+rank);
    }

}

class StaffMember extends Employee{
    private String title;

    public StaffMember(){
        super();
        title = "I dont Know";
    }

    public StaffMember(String name, String address, int phoneNumber, String email, String office, int salary,
            Date dateHired, String title) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("The information about Staff Member is as: ");
        System.out.println("Title : "+title);
    }

}

class Time{
    private int second;
    private int minute;
    private int hour;

    public Time(){
        second = 0;
        minute = 0;
        hour = 0;
    }

    public Time(int second, int minute, int hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public String toString(){
        return (hour+"h:"+minute+"m:"+second+"s");
    }

}



public class LabTask1 {
    public static void main(String[] args) {
        try {
            Date date1 = new Date();
            Time time1 = new Time(9, 30, 0);

            Person person1 = new Person("Sufyan Afzal", "ISB", 123456, "kuchbhi@gmail.com");
            Student student1 = new Student("Sufyan Afzal", "ISB", 123456, "kuchbhi@gmail.com", "BSAI");
            Employee employee1 = new Employee("Sufyan Afzal", "BWP", 123456, "maafkaro@gmail.com", "COMSATS", 123456, date1);
            Faculty faculty1 = new Faculty("Sufyan Malik", "Bas Kar do", 12345, "kitnibaar@gmail.com", "Kahin per bhi mil jaeey", 123456, date1, time1, "Gold");
            StaffMember staffMember1 = new StaffMember("Sufyan Here", "Q doon?", 12356, "main_nai_bataoonga@gmail.com", "Bas mil jaeey kahin bhi", 123456, date1, "Ye title kuch bhi de do");

            person1.display();
            student1.display();
            employee1.display();
            faculty1.display();
            staffMember1.display();

        } catch (NoSuchMethodError e) {
            System.err.println("A required constructor or method is missing. Please ensure all class files are properly compiled.");
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Execution completed.");
        }
    }
}

