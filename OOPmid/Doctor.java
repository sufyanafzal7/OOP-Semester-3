package OOPmid;

public class Doctor {
    private int doctorID;
    private String doctorName;


    public Doctor(){
        doctorID = 12345;
        doctorName = "Sufyan Afzal";
    }


    public Doctor(int doctorID, String doctorName) {
        this.doctorID = doctorID;
        this.doctorName = doctorName;
    }

    
    public int getDoctorID() {
        return doctorID;
    }
    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }
    public String getDoctorName() {
        return doctorName;
    }
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }


    public void display(){
        System.out.println("Doctor Information: ");
        System.out.printf("Name : %s, ID : %d\n",doctorName,doctorID);
    }



    

    
}
