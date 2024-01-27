package Model;

public class Hospital {
    private String hospitalName;
    private int totalBeds;
    private String hospitalAddress;
    private int hospitalPhonenum;

    public Hospital(String hospitalName,int totalBeds,String hospitalAddress,int hospitalPhonenum){
        this.hospitalName = hospitalName;
        this.totalBeds = totalBeds;
        this.hospitalAddress = hospitalAddress;
        this.hospitalPhonenum = hospitalPhonenum;
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

    public void appointdoctor(String name, String degree, String age, String speciality){

    }
}
