package Model;

import Model.Interfaces.Patient;

public class OfflinePatients  implements Patient{
    String pId;
    String patientName;
    String Illness;
    String patientGender;
    String bedNumber;
    OfflinePatients(String pId,String patientName,String Illness,String patientGender,  String bedNumber){
        this.pId =  pId;
        this.patientName = patientName;
        this.Illness = Illness;
        this.patientGender = patientGender;
        this.bedNumber =  bedNumber;
    }
    public void getMyBedNum()
    {
        System.out.println(bedNumber);
    }

    public String getPaid(){
        return pId;
    }
    public void assignMeDocotr(){

    }
    public void getmyDetails(){
        System.out.println(" My i am  Patient " + patientName);
        System.out.println(" MyId " + pId);
        System.out.println(" My Illness is " + Illness);
        System.out.println(" My Gender " + patientGender);
    }
}
