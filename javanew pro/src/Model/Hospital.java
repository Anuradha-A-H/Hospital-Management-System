package Model;

import Database.PatientDB;
import Database.DoctorDB;

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

    }
    public void getTotalDoctor(){

    }
    public void getPatientDetails(){

    }
    public void getDoctorDetails(){

    }

    public void admitpatient(String name, String patientilliness, String age, String gender){

    }

    public void appointdoctor(String name, String degree, int age, String speciality){
        int totaldoc = doctorDatabase.getTotalDoc();
        String docId = "HSP"+(totaldoc+1);
        OfflineDoctors doc = new OfflineDoctors(docId,name,degree,speciality,age);
        doctorDatabase.addDoctorToDB(doc);
    }
}
