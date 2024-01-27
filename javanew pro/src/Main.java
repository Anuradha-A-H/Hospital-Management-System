//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import Model.Hospital;
public class Main {
    public static void main(String[] args) {


        Hospital aiims = new Hospital("Aiims New Delhi", 100, "New Delhi",123456);
        aiims.gettotalBeds();
        aiims.getHospitalName();
    }
}