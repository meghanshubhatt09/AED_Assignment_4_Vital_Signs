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
public class PersonDirectory {
    
    ArrayList<Person> personList;


    public PersonDirectory() {
        personList = new ArrayList<Person>();
        populateList();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    

    public Person addPerson(){
        Person newperson = new Person();
        personList.add(newperson);
        return newperson;
    }
    
     public void addNewPerson(Person person){
        personList.add(person);
        
    }
    public void removePerson(Person p) {
        personList.remove(p);
    }

    public Person searchPerson(String PersonName) {
        for (Person person : personList) {
            if (person.getFullName().equals(PersonName)) {
                return person;
            }
        }
        return null;
    }

    private void populateList() {
        
            try{
            FileInputStream file = new FileInputStream("peopleDirectory.dat");
            ObjectInputStream input = new ObjectInputStream(file);
            boolean endoffile = false;
            
            while (!endoffile){
                try
                {
                    personList.add((Person) input.readObject());
                }
                catch(EOFException e)
                {
                   endoffile = true;
                }
                catch(Exception f)
                {
                    JOptionPane.showMessageDialog(null, f.getMessage());
                }
            }
            input.close();
        
        }
        catch (IOException e)
                {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
        
        
        
    }
    
    
    public void saveFile()
    {
        try
        {
            FileOutputStream fis = new FileOutputStream("peopleDirectory.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fis);
            
            for (int i = 0; i < personList.size(); i++)
            {
                oos.writeObject(personList.get(i));
                
            }
//            oos.writeObject(ls.get(0));
//            System.out.println(ls.get(0).getBrand());
//
//            oos.close();
            
        }
        catch(IOException e)
                {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
        
        
    }
    
    
 
    
    
}
