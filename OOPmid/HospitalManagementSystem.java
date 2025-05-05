package OOPmid;
import java.util.Scanner;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Hospital hospital1 = new Hospital(5);


        while (true) {
            System.out.println("\n--- Haspataaall Management Menu ---");
            System.out.println("1. Add Departmentt");
            System.out.println("2. Add Doctoorr to Departmentt");
            System.out.println("3. Admit Patientt");
            System.out.println("4. Assign Doctoorr to Patientt");
            System.out.println("5. Discharge Patientt");
            System.out.println("6. Displaay Patientts in Depaartmentt");
            System.out.println("7. Displaay Doctorr in Departmenttt...");
            System.out.println("8. Check Hospitaaal Capacity");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();



            switch (choice) {


                case 1:
                    System.out.print("Enter Depaaartment name.......... : ");
                    String departmentName = sc.nextLine();
                    hospital1.addDepartment(departmentName, 5, 10);
                    break;
                    

                case 2:
                    System.out.print("Enter Depaaartment name.......... : ");
                    Department department = hospital1.getDepartmentH(sc.nextLine());
                    if(department != null){
                        System.out.print("Enter dooctor name: ");
                        String doctorName = sc.nextLine();
                        System.out.print("Enter dooctor ID: ");
                        int doctorID = sc.nextInt();
                        department.addDoctor(doctorName, doctorID);
                        
                    }
                    else
                    System.out.println("Depaaartment nahi mila Bhai mere ......");
                    break;
                    

                case 3:
                    System.out.print("Enter Depaaartment name.......... : ");
                    department = hospital1.getDepartmentH(sc.nextLine());
                    if(department != null){
                        System.out.print("Enter patientt nmae : ");
                        String patientName = sc.nextLine();
                        System.out.print("Enter patientt ID : ");
                        int patientID = sc.nextInt();
                        department.addPatient(patientName, patientID);
                        Hospital.totalPatients++;
                        
                    }
                    else
                    System.out.println("Department not foundd.");
                    break;
                    

                case 4:
                    System.out.print("Enter Depaaartment name.......... : ");
                    department = hospital1.getDepartmentH(sc.nextLine());
                    if(department != null){
                        System.out.print("Enter patientt ID : ");
                        int patientID = sc.nextInt();
                        System.out.print("Enter docottrr ID : ");
                        int doctorID = sc.nextInt();
                        department.assignDoctorToPatient(patientID, doctorID);
                        
                    }
                    else
                    System.out.println("Department not foundd.");
                    break;
                    
                    
                case 5:
                    System.out.print("Enter Depaaartment name.......... : ");
                    department = hospital1.getDepartmentH(sc.nextLine());
                    if(department != null){
                        System.out.print("Enter patientt ID : ");
                        int patientID = sc.nextInt();
                        department.dischargePatients(patientID);
                        Hospital.totalPatients--;
                        
                    }
                    else
                    System.out.println("Department not foundd.");
                    break;
                    
                    
                case 6:
                    System.out.print("Enter Depaaartment name.......... : ");
                    department = hospital1.getDepartmentH(sc.nextLine());
                    if(department != null)
                    department.patientDisplay();
                    else
                    System.out.println("Department not foundd.");
                    break;


                case 7:
                    System.out.print("Enter Depaaartment name.......... : ");
                    department = hospital1.getDepartmentH(sc.nextLine());
                    if(department != null)
                    department.doctorDisplay();
                    else
                    System.out.println("Department not foundd.");
                    break;


                case 8:
                Hospital.checkHospitalCapacity();
                break;


                case 9:
                System.out.println("OK Bye Bye Mamuuuuuuu..........(;");
                break;
                    






                
                
                default:
                System.out.println("Q pangeyyy kr rha hai Bhaaaiiiiiiiiiiiiiii......");
                    break;
            }


        }
        
    }
}
