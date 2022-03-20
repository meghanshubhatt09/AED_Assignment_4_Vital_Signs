/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author meghanshubhatt
 */
public class Patient extends Person implements Serializable{
    
    private long patientId;
    Person person;
    private static int number = 1; 
    private VitalSigns vitalSigns;
    private Encounter encounter;
    
    ArrayList<Encounter> encounterHistory = new ArrayList<Encounter>();

    public Patient(long patientId, Person person) {
        this.patientId = patientId;
        this.person = person;
    }

    public Patient() {
         this.patientId = patientId;
        this.person = person;
        this.vitalSigns = vitalSigns;
    }


    
    
 
    public Encounter getEncounter() {
        return encounter;
    }

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    


    public long getPatientId() {
        return person.getPersonId();
    }

    public void setPatientId(long patientId) {
        this.patientId = person.getPersonId();
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        Patient.number = number;
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }
    
    
    
    
    
    
}
