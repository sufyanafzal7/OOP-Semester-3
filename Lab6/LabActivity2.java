package Lab6;

class Employee{
    protected String name; 
    protected String phone; 
    protected String address; 
    protected int allowance;

    public Employee(){
        name = "Sufyan";
        phone = "SAMSUNG";
        address = "BWP";
        allowance = 9;
    }


    public Employee(String name, String phone, String address, int allowance) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.allowance = allowance;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getPhone() {
        return phone;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public int getAllowance() {
        return allowance;
    }


    public void setAllowance(int allowance) {
        this.allowance = allowance;
    }

}

class EmployeeExtender extends Employee{
    private int basicPay;

    public EmployeeExtender(){
        super();
        basicPay = 2;
    }

    public EmployeeExtender(String name, String phone, String address, int allowance, int basicPay) {
        super(name, phone, address, allowance);
        this.basicPay = basicPay;
    }

    public int getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(int basicPay) {
        this.basicPay = basicPay;
    }

    public void display(){
        System.out.printf("\nName : %s, Phone : %s, Address : %s, Allowance : %d, Basic Pay : %d\n",name,phone,address,allowance,basicPay);
    }

}

class EmployeeExtender2 extends Employee{
    private int numberOfWorkingDays; 
    private int wage;

    public EmployeeExtender2(){
        super();
        numberOfWorkingDays = 5;
        wage = 4;
    }

    public EmployeeExtender2(String name, String phone, String address, int allowance, int numberOfWorkingDays,
            int wage) {
        super(name, phone, address, allowance);
        this.numberOfWorkingDays = numberOfWorkingDays;
        this.wage = wage;
    }
    public int getNumberOfWorkingDays() {
        return numberOfWorkingDays;
    }
    public void setNumberOfWorkingDays(int numberOfWorkingDays) {
        this.numberOfWorkingDays = numberOfWorkingDays;
    }
    public int getWage() {
        return wage;
    }
    public void setWage(int wage) {
        this.wage = wage;
    }

    public void display(){
        System.out.printf("\nName : %s, Phone : %s, Address : %s, Allowance : %d, Number of Working days : %d, Wage : %d\n",name,phone,address,allowance,numberOfWorkingDays,wage);
    }
    

}


public class LabActivity2 {
    public static void main(String[] args) {

        EmployeeExtender ee1 = new EmployeeExtender("Sufyan Afzal", "FA23-BAI-061", "Bahawalpur", 34, 23);
        ee1.display();
        EmployeeExtender2 ee2 =  new EmployeeExtender2("Sufyan Afzal ", "FA23-BAI-061", "Islamabad", 70, 4, 770);
        ee2.display();
        
    }
}
