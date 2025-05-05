package OOPmid;

public class Department {
    private String departmentName;
    private Doctor[] doctorD;
    private Patient[] patientD;
    private int doctorCount, patientCount;



    public Department(String departmentName, int doctorLimt, int patientLimit) {
        this.departmentName = departmentName;
        this.doctorD = new Doctor[doctorLimt];
        this.patientD = new Patient[patientLimit];
        doctorCount = 0;
        patientCount = 0;
    }




    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Doctor[] getDoctorD() {
        return doctorD;
    }

    public void setDoctorD(Doctor[] doctorD) {
        this.doctorD = doctorD;
    }

    public Patient[] getPatientD() {
        return patientD;
    }

    public void setPatientD(Patient[] patientD) {
        this.patientD = patientD;
    }




    public void addDoctor(String doctorName, int doctorID){
        if(doctorCount < doctorD.length){
            doctorD[doctorCount++] = new Doctor(doctorID, doctorName);
            System.out.println("Doctoor Assigned to "+departmentName);
        }else{
            System.out.println("Doctor Limit Reacherd in "+departmentName);
        }
    }
    

    public void addPatient(String patientName, int patientID){
        if(patientCount < patientD.length){
            patientD[patientCount++] = new Patient(patientID, patientName);
            System.out.println("Patient admitted to "+departmentName);
        }else{
            System.out.println("Patient Limit Reached in "+departmentName);
        }
    }

    
    private Doctor findDoctor(int id){
        for(int i=0; i<doctorCount; i++){
            if(doctorD[i].getDoctorID() == id)
                return doctorD[i];
            
        }return null;
    }


    private Patient findPatient(int id){
        for(int i=0; i<patientCount; i++){
            if(patientD[i].getPatientID() == id)
            return patientD[i];
        }return null;
    }

    
    public void assignDoctorToPatient(int patientID, int doctorID){
        Doctor doctor = findDoctor(doctorID);
        Patient patient = findPatient(patientID);
        if(doctor!=null && patient!=null){
            patient.assignedDoctor(doctor);
            System.out.printf("Doctor %s is assigned to Patient %s",doctor.getDoctorName(),patient.getPatientName());
        }else{
            System.out.println("Invalid Patient ID or Doctor ID.");
        }
    }


    public void dischargePatients(int patientID){
        for(int i=0; i<patientCount; i++){
            if(patientD[i].getPatientID()==patientID){
                System.out.printf("Patinet %s discharged from %s",patientD[i].getPatientName(),departmentName);
                patientD[i] = patientD[--patientCount];
                return;
            }else{
                System.out.println("Patient not found in the "+departmentName);
            }
        }

    }


    public void patientDisplay(){
        System.out.printf("Patient in %s are : ",departmentName);
        for(int i=0; i<patientCount; i++){
            patientD[i].display();
        }
    }


    public void doctorDisplay(){
        System.out.printf("Doctor in %s are : ",departmentName);
        for(int i=0; i<doctorCount; i++){
            doctorD[i].display();
        }
    }





    

    
}
