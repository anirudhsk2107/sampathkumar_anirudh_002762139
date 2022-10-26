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
