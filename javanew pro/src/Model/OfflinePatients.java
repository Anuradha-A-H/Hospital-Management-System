package Model;

import Database.DoctorDB;
import Database.PatientDB;
import Model.Interfaces.Patient;

public class OfflinePatients  implements Patient{
    String pId;
    String patientName;
    String Illness;
    String patientGender;
    int bedNumber;

    int patientage;
    DoctorDB doctorDB;
    PatientDB patientDB;

    OfflinePatients(String pId, String patientName, String Illness, int age, String patientGender, int bedNumber){
        this.pId =  pId;
        this.patientName = patientName;
        this.Illness = Illness;
        this.patientGender = patientGender;
        this.bedNumber =  bedNumber;
//        this.doctorDB = doctorDetails;
//        this.patientDB = patientDetails;
        this.patientage = age;


    }
    public void getMyBedNum()
    {
        System.out.println(bedNumber);
    }

    public String getPaid(){
        return pId;
    }

    public String getPatientName(){
        return patientName;
    }



    public void getmyDetails(){
        System.out.println(" My i am  Patient " + patientName);
        System.out.println(" MyId " + pId);
        System.out.println(" My Illness is " + Illness);
        System.out.println(" My Gender " + patientGender);
    }
}
