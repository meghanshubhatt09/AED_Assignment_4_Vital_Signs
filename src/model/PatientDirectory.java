/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import io.github.pixee.security.ObjectInputFilters;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author meghanshubhatt
 */
public class PatientDirectory {

     ArrayList<Patient> patientList ;
     
    public PatientDirectory()
    {
       patientList = new ArrayList<Patient>();
       readFile();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
     
    public void addNewPatient(Patient patient)
    {
        this.patientList.add(patient);
    }
    public void removePatient(Patient p) {
        patientList.remove(p);
    }
    
    

    public Patient addPatient(){
        Patient patient = new Patient();   
        patientList.add(patient);
        return patient;
    }
    
    
    public Patient searchPatient(long id) {
        for (Patient patient : patientList) {
            if (patient.getPersonId()==  id) {
                return patient;
            }
        }
        return null;
    } 
    
           public void saveFile() {
        try {

            FileOutputStream fos = new FileOutputStream("PatientDirectory.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //System.out.println(pList.toString());
            for (int i = 0; i < patientList.size(); i++) {
                oos.writeObject(patientList.get(i));
            }
            oos.close();
        } catch (Exception e) {
        }
    }

    public void readFile() {
        try {
            FileInputStream inn = new FileInputStream("PatientDirectory.txt");
            ObjectInputStream inObj = new ObjectInputStream(inn);
            ObjectInputFilters.enableObjectFilterIfUnprotected(inObj);
            boolean fileEnd = false;

            while (!fileEnd) {
                try {
                    patientList.add((Patient) inObj.readObject());
                    //System.out.println(pList);
                } catch (EOFException e) {
                    fileEnd = true;
                } catch (Exception f) {
                    JOptionPane.showMessageDialog(null, f.getMessage());
                }

            }
        } catch (FileNotFoundException e) {
        } catch (Exception g) {
        }

    }

    
}
