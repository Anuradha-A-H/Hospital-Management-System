package Database;

import Model.Interfaces.Doctor;
import Model.Interfaces.Patient;

import java.util.ArrayList;
import java.util.HashMap;

public class DoctorDB {

    HashMap<String, Doctor> docDetails;
    HashMap<String, ArrayList<Patient>> docsVsPatients;
    public DoctorDB(){
        docDetails = new HashMap<>();
        docsVsPatients = new HashMap<>();

    }

    public Doctor getDocById(String DocId){
        return docDetails.get(DocId);
    }
    public int getTotalDoc(){
        return docDetails.size();
    }

    public ArrayList<Patient> getPatientAssigned(String docId){
        return docsVsPatients.get(docId);
    }

    public Doctor assignPatientToDoctor(Patient p){
        String docId = "";
        int min = Integer.MAX_VALUE;
        for(String docIds : docsVsPatients.keySet())
        {
            if(docsVsPatients.get(docIds).size()<=min)
            {
                min = docsVsPatients.get(docIds).size();
                docId = docIds;
            }
        }
        ArrayList<Patient> a = docsVsPatients.getOrDefault(docId,new ArrayList<Patient>());
        a.add(p);
        docsVsPatients.put(docId,a);
        return docDetails.get(docId);
    }

    public void addDoctorToDB(Doctor d){
        String docId = d.docId();
        docDetails.put(docId,d);
        docsVsPatients.put(docId,new ArrayList<Patient>());
        System.out.println("New Doctor Is Added "+ docId);
    }
}
