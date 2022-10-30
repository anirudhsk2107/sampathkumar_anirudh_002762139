/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Appointment_Info;

import Person_Info.Doctor;
import Person_Info.Patient;
import java.util.Date;

/**
 *
 * @author Anirudh
 */
public class Encounter {
    
    private Doctor doctor;
    private Patient patient;
    private VitalSigns vitalSigns;
    private Date appointment;
    
    public Encounter(){
        vitalSigns = new VitalSigns();
        doctor = new Doctor();
        patient = new Patient();
        appointment = new Date();
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public Date getAppointment() {
        return appointment;
    }

    public void setAppointment(Date appointment) {
        this.appointment = appointment;
    }
    
    
}
