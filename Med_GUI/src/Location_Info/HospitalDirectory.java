/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Location_Info;

import java.util.ArrayList;

/**
 *
 * @author Anirudh
 */
public class HospitalDirectory {
    
    private ArrayList<Hospital> hospitalList;
    
    public ArrayList<Hospital> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(ArrayList<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }
    
    public HospitalDirectory(){
        this.hospitalList  = new ArrayList<Hospital>();
        
        Hospital hospital = new Hospital();
        hospital.setCity("Mumbai");
        hospital.setCommunity("Longwood");
        hospital.setHospName("Hospital 1");
        hospitalList.add(hospital);
        
        
        hospital = new Hospital();
        hospital.setCity("Chennai");
        hospital.setCommunity("Forest Hills");
        hospital.setHospName("Hospital 2");
        hospitalList.add(hospital);
        
        hospital = new Hospital();
        hospital.setCity("Kolkata");
        hospital.setCommunity("Boylston");
        hospital.setHospName("Hospital 3");
        hospitalList.add(hospital);
        
        hospital = new Hospital();
        hospital.setCity("Bengaluru");
        hospital.setCommunity("Roxbury");
        hospital.setHospName("Hospital 4");
        hospitalList.add(hospital);
    }
    
    public Hospital AddNewHospital(){
        Hospital newHospital = new Hospital();
        hospitalList.add(newHospital);
        return newHospital;
    }
    
    public void DeleteHospital(Hospital hospital){
        hospitalList.remove(hospital);
    }
}
