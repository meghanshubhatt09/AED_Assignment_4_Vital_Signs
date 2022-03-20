/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author meghanshubhatt
 */
public class VitalSigns implements Serializable {
    
    private int measurerespiratoryRate;
    private int measurebloodPressure;
    private int measurepulse;  
    private double measureweight; 
    private Boolean isNormal;

    public Boolean isIsNormal() {
        return isNormal;
    }

    public void setIsNormal(Boolean IsNormal) {
        this.isNormal = IsNormal;
    }
    
    public int getRespiratoryRate() {
        return measurerespiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.measurerespiratoryRate = respiratoryRate;
    }
    
    

    public double getWeight() {
        return measureweight;
    }

    public void setWeight(double weight) {
        this.measureweight = weight;
    }
    
    

    public double getBloodPressure() {
        return measurebloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.measurebloodPressure = bloodPressure;
    }

    public int getPulse() {
        return measurepulse;
    }

    public void setPulse(int pulse) {
        this.measurepulse = pulse;
    }
}
