package Model;

import Database.PatientDB;
import Database.DoctorDB;
import Model.Interfaces.Patient;
import Model.Interfaces.Doctor;

public class Hospital {
    private String hospitalName;
    private int totalBeds;
    private String hospitalAddress;
    private int hospitalPhonenum;


    DoctorDB doctorDatabase;
    PatientDB patientdatabase;
    public Hospital(String hospitalName,int totalBeds,String hospitalAddress,int hospitalPhonenum){
        this.hospitalName = hospitalName;
        this.totalBeds = totalBeds;
        this.hospitalAddress = hospitalAddress;
        this.hospitalPhonenum = hospitalPhonenum;
        doctorDatabase  = new DoctorDB();
        patientdatabase  = new PatientDB();
    }
    public void getHospitalName(){
        System.out.println(hospitalName);

    }
    public void gettotalBeds(){
        System.out.println(totalBeds);

    }
    public void gethospitalAddress(){
        System.out.println(hospitalAddress);

    }
    public void gethospitalPhonenum(){
        System.out.println(hospitalPhonenum);

    }
    public void totalPatients(){
    System.out.println(patientdatabase.gettotalPatient());
    }
    public void getTotalDoctor(){
        System.out.println(doctorDatabase.getTotalDoc());
    }
    public void getPatientDetails(String pid){
    Patient p  = patientdatabase.getPatient(pid);
    p.getmyDetails();
    }
    public void getDoctorDetails(String docId){
        Doctor d = doctorDatabase.getDocById(docId);
        d.getMyDetails();
    }

    public void admitpatient(String name, String patientilliness, int age, String gender){
        String pid = "PT"+(patientdatabase.gettotalPatient()+1);
        Patient p = new OfflinePatients(pid,name,patientilliness,age, gender, 1 );
        patientdatabase.addPatients(p);
        Doctor d = doctorDatabase.assignPatientToDoctor(p);
        System.out.println("Patient"+ p.getPatientName()+" Patient Id "+ p.getPaid());
        System.out.println(p.getPatientName()+" got assigned to Dr."+d.getDoctorName());
    }

    public void appointdoctor(String name, String degree, int age, String speciality){
        int totaldoc = doctorDatabase.getTotalDoc();
        String docId = "HSP"+(totaldoc+1);
        OfflineDoctors doc = new OfflineDoctors(docId,name,degree,speciality,age);
        doctorDatabase.addDoctorToDB(doc);
    }
}
