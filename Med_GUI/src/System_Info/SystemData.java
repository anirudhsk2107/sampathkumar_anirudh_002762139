/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System_Info;

import Person_Info.Doctor;
import Person_Info.DoctorDirectory;
import Person_Info.Patient;
import Person_Info.PatientDirectory;
import Person_Info.Person;
import Person_Info.PersonDirectory;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author Anirudh
 */
public class SystemData {
    
    private PersonDirectory personList;
    private DoctorDirectory doctorList;
    private PatientDirectory patientList;

    public SystemData(){
        personList = new PersonDirectory();
        doctorList = new DoctorDirectory();
        patientList = new PatientDirectory();
    }
    
    public ArrayList<Doctor> getDoctorList() {
        return doctorList.getDoctorList();
    }

    public void setDoctorList(DoctorDirectory doctorList) {
        this.doctorList = doctorList;
    }

    public ArrayList<Person> getPersonList() {
        return personList.getPersonList();
    }

    public void setPersonList(PersonDirectory personList) {
        this.personList = personList;
    }
    
    public void DeletePerson (Person person){
        personList.DeletePerson(person);
    }
       
    public Person AddNewPerson(){
        Person newPerson = new Person();
        personList.AddNewPerson(newPerson);
        return newPerson;
    }
        
    public Doctor AddNewDoctor(){
        Doctor newDoctor = new Doctor();
        doctorList.AddNewDoctor(newDoctor);
        return newDoctor;
    }
    
        
//    public ArrayList<Patient> getPatientList() {
//        return patientList.;
//    }
//
//    public void setPatientList(PatientDirectory patientList) {
//        this.patientList = patientList;
//    }
}
