package Lab8;

abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public abstract double earnings();

    @Override
    public String toString() {
        return String.format("%s %s\nSocial Security Number: %s", firstName, lastName, socialSecurityNumber);
    }
}

class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    @Override
    public double earnings() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return String.format("Salaried Employee: %s\nWeekly Salary: %.2f", super.toString(), weeklySalary);
    }
}

class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getHours() {
        return hours;
    }

    @Override
    public double earnings() {
        if (hours <= 40) {
            return wage * hours;
        } else {
            return 40 * wage + (hours - 40) * wage * 1.5;
        }
    }

    @Override
    public String toString() {
        return String.format("Hourly Employee: %s\nHourly Wage: %.2f; Hours Worked: %.2f", super.toString(), wage, hours);
    }
}

class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public double earnings() {
        return commissionRate * grossSales;
    }

    @Override
    public String toString() {
        return String.format("Commission Employee: %s\nGross Sales: %.2f; Commission Rate: %.2f", super.toString(), grossSales, commissionRate);
    }
}

class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString() {
        return String.format("Base-Salaried Commission Employee: %s\nBase Salary: %.2f", super.toString(), baseSalary);
    }
}

public class Activity2 {
    public static void main(String[] args) {

        Employee[] employees = new Employee[] {
            new SalariedEmployee("John", "Smith", "111-11-1111", 800.00),
            new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40),
            new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06),
            new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300)
        };


        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);

            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee baseEmployee = (BasePlusCommissionEmployee) currentEmployee;
                baseEmployee.setBaseSalary(1.10 * baseEmployee.getBaseSalary());
                System.out.printf("New base salary with 10%% increase is: %.2f%n", baseEmployee.getBaseSalary());
            }

            System.out.printf("Earnings: %.2f%n%n", currentEmployee.earnings());
        }
    }
}
