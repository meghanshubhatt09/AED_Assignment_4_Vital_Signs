/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author meghanshubhatt
 */

public class Encounter implements Serializable{
    private String encounterDate;
    private VitalSigns vitalSigns;
    private int encounterNumber;
    
    private int count = 0;

    public int getEncounterNumber() {
        return encounterNumber;
    }

    public void setEncounterNumber(int encounterNumber) {
        this.encounterNumber = encounterNumber;
    }
    
    
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    
    
    public Encounter(VitalSigns vitalSigns)
    {
        count++;
        encounterNumber = count;
        
        this.vitalSigns = vitalSigns;
       
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
        Date date = new Date();  
        encounterDate = date.toString();
    //System.out.println(formatter.format(date));  
        
    }

    public String getEncounterDate() {
        return encounterDate;
    }

    public void setEncounterDate(String encounterDate) {
        this.encounterDate = encounterDate;
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }
    
    public VitalSigns addVitalSigns() {
        VitalSigns vitalSigns = new VitalSigns();
        return vitalSigns;
    }
}
