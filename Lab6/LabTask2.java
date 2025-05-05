package Lab6;

import java.util.Scanner;

class Publication{
    protected String title;
    protected int price;

    public Publication(){
        title = "Learn Japanese";
        price = 500;
    }

    public Publication(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void display(){
        System.out.println("\nThe infromation about publication is as :");
        System.out.printf("Title : %s, Price: %d\n",title,price);
    }
}

class Book extends Publication{
    private int pageCount;
    public Book(){
        super();
        pageCount = 300;
    }
    public Book(String title, int price, int pageCount) {
        super(title, price);
        this.pageCount = pageCount;
    }
    public int getPageCount() {
        return pageCount;
    }
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("\nThe information of Book is as: ");
        System.out.printf("Page count : %d\n",pageCount);
    }

    
}

class Tape extends Publication{
    private Time playingTime;
    public Tape(){
        super();
        playingTime = new Time();
    }
    public Tape(String title, int price, Time playingTime) {
        super(title, price);
        this.playingTime = playingTime;
    }
    public Time getPlayingTime() {
        return playingTime;
    }
    public void setPlayingTime(Time playingTime) {
        this.playingTime = playingTime;
    }

    public void display(){
        super.display();
        System.out.println("\nThe information Tape is as : ");
        System.out.println(playingTime.toString());
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

public class LabTask2 {
    public static void main(String[] args) {

        // Time time1 = new Time(2, 3, 4);
        // Publication publication1 = new Publication("Learn Japanese from Zero", 450);
        // Book book1 = new Book("Learning Japanese", 3450, 340);
        // Tape tape1 = new Tape("Japanese", 2340, time1);
        // publication1.display();
        // book1.display();
        // tape1.display();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Publication Title: ");
        String pubTitle = sc.nextLine();
        System.out.print("Enter Publication Price: ");
        int pubPrice = sc.nextInt();
        sc.nextLine(); 
        Publication publication = new Publication(pubTitle, pubPrice);

        System.out.print("\nEnter Book Title: ");
        String bookTitle = sc.nextLine();
        System.out.print("Enter Book Price: ");
        int bookPrice = sc.nextInt();
        System.out.print("Enter Book Page Count: ");
        int pageCount = sc.nextInt();
        sc.nextLine(); 
        Book book = new Book(bookTitle, bookPrice, pageCount);

        System.out.print("\nEnter Tape Title: ");
        String tapeTitle = sc.nextLine();
        System.out.print("Enter Tape Price: ");
        int tapePrice = sc.nextInt();
        System.out.print("Enter Tape Playing Time (hours minutes seconds): ");
        int hours = sc.nextInt();
        int minutes = sc.nextInt();
        int seconds = sc.nextInt();
        Time playingTime = new Time(hours, minutes, seconds);
        Tape tape = new Tape(tapeTitle, tapePrice, playingTime);

        System.out.println("\nDisplaying Data:");
        publication.display();
        book.display();
        tape.display();

        sc.close();
        
    }
}
