package Lab5;

class Date{
    private int day;
    private int month;
    private int year;

    public Date(){
        day = 1;
        month = 1;
        year = 2000;
    }

    public Date(int day, int month, int year) {
        this.month = checkmonth(month); 
        this.year = year; 
        this.day = checkday(day, this.month, this.year); 
    }

    private int checkmonth(int testMonth) {
        
        if (testMonth > 0 && testMonth <= 12) {
        return testMonth;
        } else {
        System.out.println("Invalid month" + testMonth + "set to 1");
        return 1;
        }
    }

    private int checkday(int testDay, int testMonth, int testYear) {
        int daysofmonth[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
        if (testDay > 0 && testDay <= daysofmonth[testMonth]) {
            return testDay;
        } else if (testMonth == 2 && testDay == 29 && (testYear % 400 == 0 || (testYear % 4 == 0 && testYear % 100 != 0))) {
            return testDay;
        } 
        else {
            System.out.println("Invalid day " + testDay + " set to 1");
            return 1;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void display() {
        System.out.println(day + "/" + month + "/" + year);
    }

    

}


class Employee {
    private String name;
    private String fname;
    private Date birthDate;
    private Date hireDate;

    public Employee(){

    }

    public Employee(String name, String fname, Date birthDate, Date hireDate) {
        this.name = name;
        this.fname = fname;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public Date getBirthdate() {
        return birthDate;
    }

    public void setBirthdate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getHiredate() {
        return hireDate;
    }

    public void setHiredate(Date hireDate) {
        this.hireDate = hireDate;
    }

    

    public void display() {
        System.out.println("Name: " + name + " \nFather Name: " + fname);
        System.out.print("Birth Date : ");
        birthDate.display();
        System.out.print("Hire Date : ");
        hireDate.display();
        }


}


public class LabActivity2 {
    public static void main(String[] args) {
        Date birthDate1 = new Date(7, 12, 2003);
        Date hireDate1 = new Date(29, 6, 2025);
        Employee employee1 = new Employee("Sufyan Afzal", "M.Afzal", birthDate1, hireDate1);
        employee1.display();
        
    }
}
