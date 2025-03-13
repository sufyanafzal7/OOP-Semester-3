package Lab5;

class Manager{
    private String title;
    private double clubDues;
    private employeeRecord employee;
    private studentRecord student;

    public Manager(String title, double clubDues, employeeRecord employee, studentRecord student) {
        this.title = title;
        this.clubDues = clubDues;
        this.employee = employee;
        this.student = student;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public double getClubDues() {
        return clubDues;
    }
    public void setClubDues(double clubDues) {
        this.clubDues = clubDues;
    }
    public employeeRecord getEmployee() {
        return employee;
    }
    public void setEmployee(employeeRecord employee) {
        this.employee = employee;
    }
    public studentRecord getStudent() {
        return student;
    }
    public void setStudent(studentRecord student) {
        this.student = student;
    }

    public void display(){
        System.out.println("Title is : "+title);
        System.out.println("Club Dues : "+clubDues);
        System.out.println("Employee record is : \n\n");
        System.out.println("EMployye ID is : "+employee.getEmpID());
        System.out.println("EMployye salary is : "+employee.getSalary());
        System.out.println("\n\nStudent record is: \n");
        System.out.println("Degree is : "+student.getDegree());
    }
    

}

class studentRecord {
    private String degree;
    public studentRecord() {
        degree = "BSAI";
    }
    public studentRecord(String degree){
        this.degree = degree;
    }
    public void setDegree(String deg) {
    degree = deg;
    }
    public String getDegree() {
    return degree;
    }
 
    
    }

    class employeeRecord{
        private int empID;
        private double salary;

        public employeeRecord(){
            empID = 1;
            salary = 25000;
        }

        public employeeRecord(int empID, double salary) {
            this.empID = empID;
            this.salary = salary;
        }

        public int getEmpID() {
            return empID;
        }

        public void setEmpID(int empID) {
            this.empID = empID;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        
        
    }

public class LabActivity1 {
    public static void main(String[] args) {

        studentRecord studentRecord1 = new studentRecord("BS in AI");
        employeeRecord employeeRecord1 = new employeeRecord(233333, 345666);
        Manager manager1 = new Manager("Sufyan Afzal", 2, employeeRecord1, studentRecord1);

        manager1.getEmployee().setSalary(23);
        

        manager1.display();
        
    }
}
