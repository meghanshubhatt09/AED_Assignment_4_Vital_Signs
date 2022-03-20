/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.io.Serializable;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

/**
 *
 * @author meghanshubhatt
 */
public class Person implements Serializable {
    
    private String fName;
    private String lName;
    private String gender;
    private long phoneNumber;
    private int age;
    static final Random rand = new Random();
    //static final AtomicLong NEXT_ID =  new AtomicLong(0);
    //PersonDirectory personDirectory;
    private long personId = rand.nextInt(9999999);//NEXT_ID.getAndIncrement();
    House house;

    public Person() {
    }

    public Person(String fName, String lName, String gender, long phoneNumber, String Address, int age, double weight) {
        this.fName = fName;
        this.lName = lName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
    
    public long getPersonId(){
        return personId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    public String getFullName()
    {
        return getfName() + " " + getlName();
    }
    
    
    
    
    
}
