/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person_Info;

import java.util.ArrayList;

/**
 *
 * @author Anirudh
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patientList;

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    
    public Patient AddNewPatient(Patient newPatient){
        patientList.add(newPatient);
        return newPatient;
    }
    
    public Patient GetPatientById(int id){
        for(Patient pat : patientList){
            if(pat.getPersonId() == id)
                return pat;
        }
        return null;
    }
}
