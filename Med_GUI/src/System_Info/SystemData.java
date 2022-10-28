/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System_Info;

import Appointment_Info.EncounterHistory;
import Location_Info.HospitalDirectory;
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
    
    private PersonDirectory personList = new PersonDirectory();;
    private DoctorDirectory doctorList = new DoctorDirectory();;
    private PatientDirectory patientList = new PatientDirectory();
    private HospitalDirectory hospitalList = new HospitalDirectory();
    private EncounterHistory encounterList = new EncounterHistory();

    public SystemData(){
//        personList = new PersonDirectory();
//        doctorList = new DoctorDirectory();
//        patientList = new PatientDirectory();
//        hospitalList = new HospitalDirectory();
//        encounterList = new EncounterHistory();
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

    public PatientDirectory getPatientList() {
        return patientList;
    }

    public void setPatientList(PatientDirectory patientList) {
        this.patientList = patientList;
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
    
    public Patient AddNewPatient(){
        Patient newPatient = new Patient();
        patientList.AddNewPatient(newPatient);
        return newPatient;
    }
    
    public Doctor GetDoctorById(int id){
        return doctorList.GetDoctorById(id);
    }
    
    public Patient GetPatientById(int id){
        return patientList.GetPatientById(id);
    }
}
