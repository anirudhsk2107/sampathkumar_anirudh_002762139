/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Appointment_Info;

import java.util.ArrayList;

/**
 *
 * @author Anirudh
 */
public class EncounterHistory {
    private ArrayList<Encounter> encounterHist;
    
    public EncounterHistory(){
        encounterHist = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getEncounterHist() {
        return encounterHist;
    }

    public void setEncounterHist(ArrayList<Encounter> encounterHist) {
        this.encounterHist = encounterHist;
    }
}
