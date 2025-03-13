package Lab2;


class Time{
    private int seconds;
    private int minutes;
    private int hours;

    public Time(){
        seconds = 0;
        minutes = 0;
        hours = 0;
    }

    public Time(int seconds, int minutes, int hours){
        if(seconds >=0 && seconds <=60){
            this.seconds = seconds;
        }else{
            System.out.println("You enetered Incoorectly, second is set to 0.");
            seconds = 0;
        }
        if(minutes >=0 && minutes <=60){
            this.minutes = minutes;
        }else{
            System.out.println("You enetered Incoorectly, minute is set to 0.");
            minutes = 0;
        }
        if(hours >=0 && hours <=24){
            this.hours = hours;
        }else{
            System.out.println("You enetered Incoorectly, hour is set to 0.");
            hours = 0;
        }
       
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if(seconds >=0 && seconds <=60){
            this.seconds = seconds;
        }else{
            System.out.println("You enetered Incoorectly, second is set to 0.");
            seconds = 0;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if(minutes >=0 && minutes <=60){
            this.minutes = minutes;
        }else{
            System.out.println("You enetered Incoorectly, minute is set to 0.");
            minutes = 0;
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if(hours >=0 && hours <=24){
            this.hours = hours;
        }else{
            System.out.println("You enetered Incoorectly, hour is set to 0.");
            hours = 0;
        }
    }

    public void display(){
        System.out.printf("%dh:%dm:%ds",hours,minutes,seconds);
    }

}


public class LabTask5 {
    public static void main(String[] args) {

        Time timePak = new Time(32, 03, 04);
        timePak.display();
    }
}
