package Lab5;

class Address{
    private int streetNo;
    private int houseNo;
    private String city;
    private int code;

    public Address(){
        streetNo = 2;
        houseNo = 7;
        city = "Bahawalpur";
        code = 12345;
    }

    public Address(int streetNo, int houseNo, String city, int code) {
        this.streetNo = streetNo;
        this.houseNo = houseNo;
        this.city = city;
        this.code = code;
    }

    public int getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(int streetNo) {
        this.streetNo = streetNo;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void display(){
        System.out.println("The address is : ");
        System.out.printf("City : %s, Street No : %d, House No: %d, Zip Code : %d",city,streetNo,houseNo,code);
    }

}

class Person{
    private String name;
    private int age;
    private char gender;
    private Address address;

    public Person(){

    }

    public Person(String name, int age, char gender, Address address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void display(){
        System.out.println("Person details are as : ");
        System.out.printf("Name : %s, Age : %d, Gender : %c\n",name,age,gender);
        address.display();
    }

}

public class LabTask1 {
    public static void main(String[] args) {
        Address address1 = new Address(4, 7, "Islamabad", 1234);
        Person person1 = new Person("Sufyan Afzal", 22, 'M',address1);
        
        person1.display();

        person1.getAddress().setCity("Islamabad Burgers");
        person1.display();

    }
}
