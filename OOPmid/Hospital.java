package OOPmid;

public class Hospital {
    private Department[] departmentH;
    private int departmentCount;
    protected static int totalPatients = 0;


    public Hospital(int maxDepartmentLimit){
        this.departmentH = new Department[maxDepartmentLimit];
        this.departmentCount = 0;
    }


    public Department getDepartmentH(String departmentName) {
        for(int i=0; i<departmentCount; i++){
            departmentH[i].getDepartmentName().equalsIgnoreCase(departmentName);
            return departmentH[i];
        }return null;
    }


    public void setDepartmentH(Department[] departmentH) {
        this.departmentH = departmentH;
    }
    

    public void addDepartment(String departmentName, int doctorLimit, int patinetLimit){
        if( departmentCount < departmentH.length){
            departmentH[departmentCount++] = new Department(departmentName, doctorLimit, patinetLimit);
            System.out.println("Depaaartment adedd brooo : "+departmentName);

        }else{
            System.out.println("No more depaaartment can be adddedddddddd.");
        }
    }


    public static void checkHospitalCapacity(){
        System.out.println("Total patientsss in Hospitel are : "+totalPatients);
    }











}
