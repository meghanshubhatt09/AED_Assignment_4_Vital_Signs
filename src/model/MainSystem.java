/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author meghanshubhatt
 */
public class MainSystem {
    
    PersonDirectory persondirectory;
    PatientDirectory patientdirectory;
    City city;
    ArrayList<City> cityList;
    
    

    public MainSystem() {
        persondirectory = new PersonDirectory();
        patientdirectory = new PatientDirectory();
        //city = new City();
        cityList = new ArrayList<City>();
        
    }

    public PatientDirectory getPatientdirectory() {
        return patientdirectory;
    }

    public void setPatientdirectory(PatientDirectory patientdirectory) {
        this.patientdirectory = patientdirectory;
    }

    public ArrayList<City> getCityList() {
        return cityList;
    }

    public void setCityList(ArrayList<City> cityList) {
        this.cityList = cityList;
    }
    
    public City addCityList(String cityName) throws ClassNotFoundException{
        City newcity = new City(cityName);
        cityList.add(newcity);
        return newcity;
    }
    public void removeCityList(City p) {
        cityList.remove(p);
    } 

    public PersonDirectory getPersondirectory() {
        return persondirectory;
    }

    public void setPersondirectory(PersonDirectory persondirectory) {
        this.persondirectory = persondirectory;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
    
    public City addCity(String cityName) {
        City newcity = new City(cityName);
        return newcity;
    }
    
    
    
    
    
}
