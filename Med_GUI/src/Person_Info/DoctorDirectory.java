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
public class DoctorDirectory {
    private static ArrayList<Doctor> doctorList;

    public static ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public static void setDoctorList(ArrayList<Doctor> doctorList) {
        DoctorDirectory.doctorList = doctorList;
    }
    
    public Doctor AddNewDoctor(Doctor newDoctor){
        doctorList.add(newDoctor);
        return newDoctor;
    }
    
    public Doctor GetDoctorById(int id){
        for(Doctor doc : doctorList){
            if(doc.getPersonId() == id)
                return doc;
        }
        return null;
    }
    
    public void DeleteDoctorById(int id){
        for(Doctor doc : doctorList){
            if(doc.getPersonId() == id)
                doctorList.remove(doc);
        }
    }
}
