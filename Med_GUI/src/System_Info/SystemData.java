/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System_Info;

import Appointment_Info.EncounterHistory;
import Location_Info.City;
import Location_Info.Community;
import Location_Info.Hospital;
import Location_Info.HospitalDirectory;
import Location_Info.House;
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
    private ArrayList<City> cityList = new ArrayList<City>();
    private ArrayList<Community> communityList = new ArrayList<Community>();
    private ArrayList<House> houseList = new ArrayList<House>();

    public SystemData(){
        City city = new City();
        city.setCityName("Mumbai");
        cityList.add(city);
        city = new City();
        city.setCityName("Chennai");
        cityList.add(city);
        city = new City();
        city.setCityName("Kolkata");
        cityList.add(city);
        city = new City();
        city.setCityName("Bengaluru");
        cityList.add(city);
        
        Community community = new Community();
        community.setCommunityName("Longwood");
        communityList.add(community);
        community = new Community();
        community.setCommunityName("Forest Hills");
        communityList.add(community);
        community = new Community();
        community.setCommunityName("Boylston");
        communityList.add(community);
        community = new Community();
        community.setCommunityName("Roxbury");
        communityList.add(community);
        
        House house = new House();
        house.setHouseName("House 1");
        houseList.add(house);
        house = new House();
        house.setHouseName("House 2");
        houseList.add(house);
        house = new House();
        house.setHouseName("House 3");
        houseList.add(house);
        house = new House();
        house.setHouseName("House 4");
        houseList.add(house);
    }
    
    public HospitalDirectory getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(HospitalDirectory hospitalList) {
        this.hospitalList = hospitalList;
    }

    public EncounterHistory getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(EncounterHistory encounterList) {
        this.encounterList = encounterList;
    }

    public ArrayList<City> getCityList() {
        return cityList;
    }

    public void setCityList(ArrayList<City> cityList) {
        this.cityList = cityList;
    }

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(ArrayList<Community> communityList) {
        this.communityList = communityList;
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
    
    public void AddNewHospital(String hospital, Community community, City city){
        Hospital newHospital = hospitalList.AddNewHospital();
        newHospital.setHospName(hospital);   
        newHospital.setCommunity(community.getCommunityName());   
        newHospital.setCity(city.getCityName());   
    }
    
    public City AddNewCity(){
        City city = new City();
        cityList.add(city);
        return city;
    }
    
    public Community AddNewCommunity(){
        Community community = new Community();
        communityList.add(community);
        return community;
    }
    
    public void AddNewHouse(String houseName, Community community, City city){
        House house = new House();
        house.setHouseName(houseName);
        house.setCity(city);
        house.setCommunity(community);
        houseList.add(house);
    }
    
    public Doctor GetDoctorById(int id){
        return doctorList.GetDoctorById(id);
    }
    
    public Patient GetPatientById(int id){
        return patientList.GetPatientById(id);
    }
    
    public void DeleteDoctorById(int id){
        doctorList.DeleteDoctorById(id);
    }
    
    public void DeletePatientById(int id){
        patientList.DeletePatientById(id);
    }
}
