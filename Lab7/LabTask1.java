package Lab7;

abstract class Movie{

    protected String rating;
    protected int IDnumber;
    protected String title;
    public Movie(){
        rating = "A";
        IDnumber = 12345;
        title = "Sufyan";

    }
    public Movie(String rating, int iDnumber, String title) {
        this.rating = rating;
        IDnumber = iDnumber;
        this.title = title;
    }
    public String getRating() {
        return rating;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }
    public int getIDnumber() {
        return IDnumber;
    }
    public void setIDnumber(int iDnumber) {
        IDnumber = iDnumber;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    abstract public void equals(Movie m);
    public void calculateLATEfees(int fee){
        System.out.println("The Late fees is 2$");
    }
}

class Action extends Movie{

    public Action(String rating, int IDnumber, String title){
        super(rating, IDnumber, title);

    }
    @Override
    public void calculateLATEfees(int fee){

        System.out.printf("\nThe Late fee is %d\n",fee*3);

    }
    @Override
    public void equals(Movie m){
        if(m.IDnumber==this.IDnumber){
            System.out.println("IDs are equal.");
        }else{
            System.out.println("IDs are not equal.");
        }

    }
}
class Comedy extends Movie{

    public Comedy(String rating, int IDnumber, String title){
        super(rating, IDnumber, title);

    }
    @Override
    public void calculateLATEfees(int fee){

        System.out.printf("\nThe Late fee is %d\n",fee*2.50);

    }
    @Override
    public void equals(Movie m){
        if(m.IDnumber==this.IDnumber){
            System.out.println("IDs are equal.");
        }else{
            System.out.println("IDs are not equal.");
        }

    }
}
class Drama extends Movie{

    public Drama(String rating, int IDnumber, String title){
        super(rating, IDnumber, title);

    }
    @Override
    public void calculateLATEfees(int fee){

        System.out.printf("\nThe Late fee is %d\n",fee*2);

    }
    @Override
    public void equals(Movie m){
        if(m.IDnumber==this.IDnumber){
            System.out.println("IDs are equal.");
        }else{
            System.out.println("IDs are not equal.");
        }

    }
}

public class LabTask1 {
    public static void main(String[] args) {

        Action action1 = new Action("A", 12345, "Malik");
        Comedy comedy1 = new Comedy("A", 12345, "Malik");
        Drama drama1 = new Drama("A", 12345, "Malik");

        action1.calculateLATEfees(12);

        action1.equals(comedy1);

        
    }
}
