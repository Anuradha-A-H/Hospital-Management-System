//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import Model.Hospital;

public class Main {
    public static void main(String[] args) {


        Hospital aiims = new Hospital("Aiims New Delhi", 100, "New Delhi",123456);

        aiims.appointdoctor("SOM","MBBS",25,"Heart");
        aiims.appointdoctor("Anuradha","MBBS",26,"Brain");
        aiims.appointdoctor("Raj","MBBS",26,"Stomach");
        aiims.gettotalBeds();
        aiims.getHospitalName();
        aiims.gettotalBeds();
        aiims.getDoctorDetails("HSP1");
        aiims.totalPatients();
        aiims.admitpatient("Patient1","Cold",40,"Female");
        aiims.admitpatient("Rithu","Fiv",26,"Female");
        aiims.getPatientDetails("PT2");
    }


}