package OOPmid;

class Patient{
    private int patientID;
    private String patientName;
    private Doctor doctorAssigned;


    public Patient(){
        patientID = 12345;
        patientName = "Sufyan Afzal";
    }


    public Patient(int patientID, String patientName) {
        this.patientID = patientID;
        this.patientName = patientName;
        this.doctorAssigned = null;
    }
    

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void assignedDoctor(Doctor doctor){
        this.doctorAssigned = doctor;
    }



    public void display(){
        System.out.println("Patient Information : ");
        System.out.printf("Name : %s, ID : %d\n",patientName,patientID);
        if(doctorAssigned != null){
            System.out.printf("Assigned Doctor : %s",doctorAssigned.getDoctorName());
        }
    }










    
    
}
