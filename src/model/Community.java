/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
 
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author meghanshubhatt
 */
public class Community implements Serializable{
    private String communityName;
    HashMap<House,String> communityMapper;
    ArrayList<House> houseList;
    String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Community(String communityName) {
        this.communityName = communityName;
        this.houseList = new ArrayList<House>();
        communityMapper = new HashMap<House, String>();
        
    }
    
   
    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }


    public ArrayList<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(ArrayList<House> houseList) {
        this.houseList = houseList;
    }
    
    public House makeHouse()
    {
     House house = new House();
     houseList.add(house);
     communityMapper.put(house,communityName);
     return house;
    }
    
    public String getCommunity(House house){
        String CommunityName = communityMapper.get(house);
        return CommunityName;
    }
    
    @Override
    public String toString()
    {
        return this.communityName;
        
    } 
    
    
    
    
    
    
    
}
